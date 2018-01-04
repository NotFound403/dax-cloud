package cn.felord.upload.service.impl;

import cn.felord.common.enums.UploadPathEnums;
import cn.felord.upload.service.Uploader;
import cn.felord.upload.util.UploadUtil;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * The type Upload service.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /12/13 14:25
 */
@Service
public class UploaderImpl implements Uploader {


    @Override
    public boolean fileUpload(MultipartFile multipartFile, UploadPathEnums uploadPathEnums) {
        String path=uploadPathEnums.getPath()+multipartFile.getOriginalFilename();
        return UploadUtil.saveMultipartFile(multipartFile, path);
    }

    @Override
    public boolean fileUpload(byte[] bytes, String path) {
        return UploadUtil.writeToFile(bytes, path);
    }

    @Override
    public byte[] readFile(UploadPathEnums uploadPathEnums, String fileName) {
        return UploadUtil.readFile(UploadUtil.ROOT + uploadPathEnums.getPath() + fileName);
    }

    @Override
    public void deleteFiles(UploadPathEnums uploadPathEnums, String[] fileNames) {
        for (int i = 0; i < fileNames.length; i++) {
            fileNames[i] += UploadUtil.ROOT + uploadPathEnums.getPath();
        }
        UploadUtil.deleleFiles(fileNames);
    }

}
