package cn.felord.upload.service;

import cn.felord.common.enums.UploadPathEnums;
import org.springframework.web.multipart.MultipartFile;

/**
 * The interface Upload service.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /12/13 14:22
 */
public interface Uploader {

    /**
     * File upload.
     *
     * @param multipartFile   the multipart file
     * @param uploadPathEnums the upload path enums
     * @return the boolean
     */
    boolean fileUpload(MultipartFile multipartFile, UploadPathEnums uploadPathEnums);

    /**
     * File upload.
     *
     * @param bytes the bytes
     * @param path  the path
     * @return the boolean
     */
    boolean fileUpload(byte [] bytes,String path);

    /**
     * Read file boolean.
     *
     * @param uploadPathEnums the upload path enums
     * @param fileName        the file name
     * @return the boolean
     */
    byte[] readFile(UploadPathEnums uploadPathEnums, String fileName);

    /**
     * Delete files.
     *
     * @param uploadPathEnums the upload path enums
     * @param fileNames       the file names
     */
    void deleteFiles(UploadPathEnums uploadPathEnums,String [] fileNames);
}
