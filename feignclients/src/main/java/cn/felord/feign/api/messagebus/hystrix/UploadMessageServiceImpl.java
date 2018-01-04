package cn.felord.feign.api.messagebus.hystrix;

import cn.felord.common.entity.system.Rest;
import cn.felord.feign.api.messagebus.UploadMessageService;
import cn.felord.feign.log.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author dax.
 * @version v1.0
 * @since 2017/12/15 15:34
 */
@Component
public class UploadMessageServiceImpl implements UploadMessageService {
    private static final Logger log = LoggerFactory.getLogger(UploadMessageService.class);

    @Override
    public Rest uploadImg(MultipartFile multipartFile) {
        Log.serviceDown(log, "MESSAGE-BUS");
        return Rest.bad("服务不可用");
    }
}
