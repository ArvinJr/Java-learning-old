package com.xinzhi;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author arvin
 * @date 2021/2/2
 */
public class Bubble {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(10000000);
        Random random = new Random();

        for (int i = 0; i < 100000; i++) {
            int num = random.nextInt(100000000);
            list.add(num);
        }
        System.out.println("--------开始计时-----------");

        long start = System.currentTimeMillis();


//        for (int i = 0; i < list.size() - 1; i++) {
//            for (int j = 0; j < list.size() - i - 1; j++) {
//                if (list.get(j) > list.get(j+1)){
//                    int temp = list.get(j);
//                    list.set(j,list.get(j+1));
//                    list.set(j+1,temp);
//                }
//            }
//        }

        long end = System.currentTimeMillis();

        System.out.println("---------结束---------" + (end-start) + "毫秒");
    }
}
