package cn.felord.feign.api.uploadservice;


import cn.felord.common.entity.system.Rest;
import cn.felord.common.enums.UploadPathEnums;
import cn.felord.feign.api.uploadservice.hystrix.UploadServiceImpl;
import cn.felord.feign.config.FeignMultipartSupportConfig;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

/**
 * The interface Upload service.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /12/13 14:48
 */
@FeignClient(value = "UPLOAD-SERVICE", configuration = FeignMultipartSupportConfig.class, fallback = UploadServiceImpl.class)
public interface UploadService {

    /**
     * Multipart upload rest.
     *
     * @param multipartFile   文件对象
     * @param uploadPathEnums 路径
     * @return the rest
     */
    @PostMapping(value = "/upload/feign/file", produces = {MediaType.APPLICATION_JSON_UTF8_VALUE}, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    Rest multipartUpload(@RequestPart("multipartFile") MultipartFile multipartFile, @RequestParam("uploadPathEnums") UploadPathEnums uploadPathEnums);

    /**
     * Multipart upload rest.
     *
     * @param multipartFiles  the multipart files
     * @param uploadPathEnums the upload path enums
     * @return the rest
     */
    @PostMapping(value = "/upload/feign/files", produces = {MediaType.APPLICATION_JSON_UTF8_VALUE}, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    Rest multipartUpload(@RequestPart("multipartFiles") MultipartFile[] multipartFiles, @RequestParam("uploadPathEnums") UploadPathEnums uploadPathEnums);


    /**
     * Write byte rest.
     *
     * @param data the data
     * @param path the path
     * @return the rest
     */
    @PostMapping(value = "/upload/feign/bytes")
    Rest writeByte(@RequestParam("data") byte[] data, @RequestParam("path") String path);


    /**
     * Delete imgs.
     *
     * @param fileNames the file names
     */
    @PostMapping("/upload/feign/delete/food/img")
    void deleteImgs(@RequestParam("fileNames") String[] fileNames);
}

