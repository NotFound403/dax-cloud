package cn.felord.upload.controller;

import cn.felord.common.entity.system.Rest;
import cn.felord.common.enums.UploadPathEnums;
import cn.felord.upload.service.Uploader;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.DataOutputStream;
import java.io.IOException;

/**
 * The type Upload controller.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /12/13 14:29
 */
@RestController
@RequestMapping("/upload")
public class UploadController {
    private static final String msg = "file is not exist";

    @Resource
    private Uploader uploader;

    /**
     * Multipart upload rest.
     *
     * @param multipartFile the multipart file
     * @return the rest
     */
    @PostMapping("/feign/file")
    public Rest multipartUpload(MultipartFile multipartFile, UploadPathEnums uploadPathEnums) {

        boolean flag = uploader.fileUpload(multipartFile, uploadPathEnums);
        return flag ? Rest.ok() : Rest.ok("上传失败");
    }

    /**
     * Multipart upload rest.
     *
     * @param multipartFiles the multipart files
     * @return the rest
     */
    @PostMapping("/feign/files")
    public Rest multipartUpload(MultipartFile[] multipartFiles, UploadPathEnums uploadPathEnums) {
        if (multipartFiles == null || multipartFiles.length <= 0) {
            return Rest.ok("文件为空");
        }
        for (MultipartFile multipartFile : multipartFiles) {

            uploader.fileUpload(multipartFile, uploadPathEnums);
        }
        return Rest.ok();
    }

    /**
     * Write byte rest.
     *
     * @param data the data
     * @param path the path
     * @return the rest
     */
    @PostMapping("/feign/bytes")
    public Rest writeByte(@RequestParam byte[] data, @RequestParam String path) {
        uploader.fileUpload(data, path);
        return Rest.ok();
    }

    /**
     * 读取食谱图片.
     * <p>
     * 直接读取 不用feign客户端
     *
     * @param response the response
     * @param path     the path
     */
    @GetMapping("/read/food/img")
    public void readFoodImg(HttpServletResponse response, @RequestParam String path) {

        byte[] bytes = null;
        try {
            bytes = uploader.readFile(UploadPathEnums.FOOD, path);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (DataOutputStream dos = new DataOutputStream(response.getOutputStream())) {
            if (bytes != null) {
                dos.write(bytes, 0, bytes.length);
            }else {
                byte [] msgBytes=msg.getBytes("UTF-8");
                dos.write(msgBytes, 0, msgBytes.length);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    /**
     * 删除图片.
     *
     * @param fileNames the file names
     */
    @PostMapping("/feign/delete/food/img")
    public void deleteImgs(String[] fileNames) {
        uploader.deleteFiles(UploadPathEnums.FOOD, fileNames);
    }
}
