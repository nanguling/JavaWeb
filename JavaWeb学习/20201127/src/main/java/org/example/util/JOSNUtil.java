package org.example.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;

public class JOSNUtil {
    //jackson框架中，对json字符串和java对象之间互相转换的类
    private static final ObjectMapper MAPPER = new ObjectMapper();

    /**
     * 序列化操作：java对象序列化为json字符串
     * @param o java对象
     * @return json字符串
     */
    //序列化
    public static String serialize(Object o) {
        try {
            return MAPPER.writeValueAsString(o);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            throw new RuntimeException("java对象序列化为JSON字符串出错"+o);
        }
    }
    //反序列化

    /**
     * 反序列化输入流/字符串为java对象
     * @param is 输入流
     * @param tClass 指定要反序列化的java对象
     * @param <T> 定义的java对象的类型
     * @return 反序列化后的java对象
     */
    public static <T> T deSerialize(InputStream is,Class<T> tClass){
        try {
            return MAPPER.readValue(is,tClass);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("反序列化失败");
        }
    }
}
