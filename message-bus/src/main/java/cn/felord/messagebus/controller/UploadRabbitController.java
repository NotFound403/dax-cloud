package cn.felord.messagebus.controller;

import cn.felord.common.entity.system.MetaData;
import cn.felord.messagebus.enums.UnitEnums;
import cn.felord.messagebus.provider.RabbitProvider;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.IOException;

/**
 * The type Upload rabbit controller.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /12/8 9:57
 */
@RestController
@RequestMapping("/upload")
public class UploadRabbitController {

    @Resource
    private RabbitProvider<MetaData> rabbitProvider;

    /**
     * 打卡拍照上传.
     *
     * @param multipartFile the multipart file
     */
    @PostMapping("/feign/checkinimg/delay")
    public void uploadImg(@RequestPart("multipartFile") MultipartFile multipartFile) {

        try {
            byte []    data = multipartFile.getBytes();
          String img=multipartFile.getOriginalFilename();
            MetaData  metaData=new MetaData();
            metaData.setFileName(img);
            metaData.setData(data);
            rabbitProvider.sendDelay(UnitEnums.UPLOAD, metaData);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
