package cn.felord.feign.api.uploadservice.hystrix;

import cn.felord.common.entity.system.Rest;
import cn.felord.common.enums.UploadPathEnums;
import cn.felord.feign.api.uploadservice.UploadService;
import cn.felord.feign.log.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

/**
 * The type Upload service.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /12/15 15:38
 */
@Component
public class UploadServiceImpl implements UploadService {
    private static final Logger log = LoggerFactory.getLogger(UploadService.class);

    @Override
    public Rest multipartUpload(MultipartFile multipartFile, UploadPathEnums uploadPathEnums) {
        Log.serviceDown(log, "UPLOAD-SERVICE");
        return Rest.bad("服务不可用");
    }

    @Override
    public Rest multipartUpload(MultipartFile[] multipartFiles,UploadPathEnums uploadPathEnums) {
        Log.serviceDown(log, "UPLOAD-SERVICE");
        return Rest.bad("服务不可用");
    }

    @Override
    public Rest writeByte(byte[] data, String path) {
        Log.serviceDown(log, "UPLOAD-SERVICE");
        return Rest.bad("服务不可用");
    }

    @Override
    public void deleteImgs(String[] fileNames) {
        Log.serviceDown(log, "UPLOAD-SERVICE");
    }
}
