package cn.felord.common.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * The type Jackson json parser.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /11/24 16:30
 */
public final class JacksonJsonParser {
    private static ObjectMapper objectMapper = new ObjectMapper();

    private JacksonJsonParser() {
    }

    /**
     * Json body string.
     *
     * @param <T> the type parameter
     * @param t   the t
     * @return the string
     * @throws JsonProcessingException the json processing exception
     */
    public static <T> String jsonBody(T t) throws JsonProcessingException {
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
        return objectMapper.writeValueAsString(t);
    }

    /**
     * Json to object t.
     *
     * @param <T>   the type parameter
     * @param json  the json
     * @param clazz the clazz
     * @return the t
     * @throws IOException the io exception
     */
    public static <T> T jsonToObject(String json, Class<? extends T> clazz) throws IOException {
        return objectMapper.readValue(json, clazz);
    }

    /**
     * Json to object t.
     *
     * @param <T>   the type parameter
     * @param bytes the bytes
     * @param clazz the clazz
     * @return the t
     * @throws IOException the io exception
     */
    public static <T> T jsonToObject(byte [] bytes, Class<? extends T> clazz) throws IOException {
        return objectMapper.readValue(bytes, clazz);
    }
}
