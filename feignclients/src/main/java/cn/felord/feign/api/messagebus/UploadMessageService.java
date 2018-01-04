package cn.felord.feign.api.messagebus;


import cn.felord.common.entity.system.Rest;
import cn.felord.feign.api.messagebus.hystrix.UploadMessageServiceImpl;
import cn.felord.feign.config.FeignMultipartSupportConfig;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

/**
 * The interface Upload service.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /12/8 10:09
 */
@FeignClient(value = "MESSAGE-BUS", configuration = FeignMultipartSupportConfig.class , fallback = UploadMessageServiceImpl.class )
public interface UploadMessageService {
    /**
     * 考勤图片上传到消息队列 参见 MESSAGE-BUS 服务.
     *
     * @param multipartFile the multipart file
     * @return the rest
     */
    @PostMapping(value = "/upload/feign/checkinimg/delay", produces = {MediaType.APPLICATION_JSON_UTF8_VALUE}, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    Rest uploadImg(@RequestPart("multipartFile") MultipartFile multipartFile);
}
