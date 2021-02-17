package com.xonzhi;

import java.util.HashMap;
import java.util.Map;

/**
 * @author arvin
 * @date 2021/2/17
 */
public class Test1 {

    public static void main(String[] args) {
        String connect = "hello world hello World aa" +
                " bb cc dd bb dd xxx ddd xxx ooo DD";
        // 1、先全部变成小写
        connect = connect.toLowerCase();

        // 2、字符串搞成数组
        String[] words = connect.split(" ");

        // 3、创建一个hashmap保存结果
        Map<String,Integer> result = new HashMap<>(16);

        // 4、循环便利数组，诸葛单词遍历
        for (String word : words) {
            // 看一看hashmap里有没有key
            // 有的话value+1
            if (result.containsKey(word)){
                result.put(word,result.get(word) + 1);
            }else {
                result.put(word,1);
            }
        }

        for (Map.Entry<String,Integer> entry : result.entrySet()){
            System.out.println(entry.getKey() + "出现了" + entry.getValue() + "次了");
        }
    }

}
