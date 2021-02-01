package com.test;

import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author arvin
 * @date 2021/2/1
 */
public class MapTest {

    @Test
    public void Test1(){
        Map<String,User> map = new HashMap<>();
        map.put("banzhang",new User("fsdfd",null));
        map.put("xuexi",new User("gfdg",null));

        System.out.println(map.get("banzhang"));

        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(map.get(key));
        }

        Iterator<Map.Entry<String, User>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, User> next = iterator.next();
            System.out.println(next.getKey());
            System.out.println(next.getValue());
        }
    }
}
