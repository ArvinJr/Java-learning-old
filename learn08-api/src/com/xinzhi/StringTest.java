package com.xinzhi;

import org.junit.Test;

import java.nio.charset.Charset;

/**
 * @author arvin
 * @date 2021/2/4
 */
public class StringTest {

    @Test
    public void test1(){
        String str = "abc";
        byte[] bytes = str.getBytes(Charset.forName("gbk"));
        System.out.println(bytes[0]);
    }

}
