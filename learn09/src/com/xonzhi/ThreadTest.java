package com.xonzhi;

import java.util.*;

/**
 * @author arvin
 * @date 2021/2/17
 */
public class ThreadTest {

//    public static List<Integer> LIST = new Vector<>();
    public static StringBuffer SB = new StringBuffer();

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            list.add(UUID.randomUUID().toString());
        }

        StringBuilder sb = new StringBuilder();
        for (String s : list) {
            sb.append(s).append("_");
        }
        System.out.println(sb);
    }

}
