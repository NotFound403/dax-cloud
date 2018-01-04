package cn.felord.messagebus;

import cn.felord.messagebus.config.MqConfig;
import cn.felord.messagebus.provider.RabbitProvider;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * 消息总线
 *
 * @author dax.
 * @version v1.0
 * @since 2017/11/21 13:35
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MessageBusApplicationTests {
  @Resource
    RabbitProvider rabbitProvider;
  @Test
  public void testConexts(){

  }

}
