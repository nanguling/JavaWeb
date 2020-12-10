package com.mystudy.test;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mystudy.entity.Message;

import java.util.List;

public class Test {
    public static void fun1() throws JsonProcessingException {
        String s = "[\n" +
                "    {   \"id\":1,\n" +
                "        \"who\":\"sss\",\n" +
                "        \"when\":\"2020\",\n" +
                "        \"what\":\"xxx\"\n" +
                "    },\n" +
                "    {   \"id\":2,\n" +
                "        \"who\":\"aaa\",\n" +
                "        \"when\":\"2020\",\n" +
                "        \"what\":\"xxx\"\n" +
                "    },\n" +
                "    {   \"id\":3,\n" +
                "        \"who\":\"ddd\",\n" +
                "        \"when\":\"2020\",\n" +
                "        \"what\":\"xxx\"\n" +
                "    }\n" +
                "]";
        //json字符串转list集合
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.getTypeFactory().constructParametricType(List.class, Message.class);
        List<Message> list = mapper.readValue(s,type);
        System.out.println(list);

        /*//json字符串转单个对象
        String a = "{   \"id\":1,\n" +
                "    \"who\":\"sss\",\n" +
                "    \"when\":\"2020\",\n" +
                "    \"what\":\"xxx\"\n" +
                "}";
        Message message = mapper.readValue(a,Message.class);
        System.out.println(message);*/
    }

    public static String fun(List list) {
        ObjectMapper mapper = new ObjectMapper();
        String res = null;
        try {
            res = mapper.writeValueAsString(list);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return "";
        }
        return res;
    }
}
