package org.example.util;

import org.junit.Assert;
import org.junit.Test;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class JSONUtilTest {
    @Test//junit单元测试的注解，需要写在public void 方法
    public void testSerialize() {
        Map<String,String> map = new HashMap<>();
        map.put("userName","张三");
        map.put("password","123");
        String json = JOSNUtil.serialize(map);
        //标准方案
        Assert.assertNotNull(json);
    }
    @Test
    public void testDeSerialize() {
        InputStream is = JSONUtilTest.class.getClassLoader().getResourceAsStream("login.json");
        HashMap map = JOSNUtil.deSerialize(is,HashMap.class);
        System.out.println(map);
    }
}
