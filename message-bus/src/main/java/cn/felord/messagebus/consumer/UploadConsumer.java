package cn.felord.messagebus.consumer;

import cn.felord.common.entity.system.MetaData;
import cn.felord.common.enums.UploadPathEnums;
import cn.felord.common.util.CommonUtil;
import cn.felord.feign.api.uploadservice.UploadService;
import cn.felord.messagebus.util.MessageUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * 图片上传消息监听
 *
 * @author dax.
 * @version v1.0
 * @since 2017/12/8 9:41
 */
@Component
public class UploadConsumer implements RabbitMessageListener {
    private static final String QUEUE_NAME = "UPLOAD_QUEUE";
    private static final Logger log = LoggerFactory.getLogger(UploadConsumer.class);
    @Resource
    private UploadService uploadService;

    @Override
    @RabbitListener(queues = {QUEUE_NAME})
    public void on(Message message) {
        try {
            MetaData metaData = MessageUtil.converter(message, MetaData.class);

            String img = metaData.getFileName();
            byte[] data = metaData.getData();

            String path = UploadPathEnums.CARD.getPath() + File.separator + CommonUtil.formatDate(new Date(), "yyyyMMdd") + "/" + img;
            uploadService.writeByte(data, path);
        } catch (IOException e) {
            log.debug("监听队列：{} 消费出错 异常：{}", QUEUE_NAME, e.getMessage());
        }
    }
}
