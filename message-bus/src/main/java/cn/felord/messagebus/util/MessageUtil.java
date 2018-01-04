package cn.felord.messagebus.util;

import cn.felord.common.util.JacksonJsonParser;
import org.springframework.amqp.core.Message;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * The type Message util.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /12/6 14:49
 */
public class MessageUtil {

    private MessageUtil() {
    }

    /**
     * mq 消息实体转换器  .
     *
     * @param <T>     the type parameter
     * @param message the message
     * @param clazz   the clazz  实体对象必须序列化
     * @return the t
     * @throws IOException the io exception
     */
    public static <T> T converter(Message message, Class<T> clazz) throws IOException {
        byte[] bytes = message.getBody();
        return JacksonJsonParser.jsonToObject(bytes, clazz);
    }


    public static Object deserializeObject(Message message) throws IOException, ClassNotFoundException {

        byte[] bytes = message.getBody();

        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bis);
        Object obj = ois.readObject();
        ois.close();
        bis.close();

        return obj;
    }

}
