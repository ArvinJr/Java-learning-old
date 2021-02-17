package com.xonzhi;

import java.util.*;

/**
 * @author arvin
 * @date 2021/2/17
 */
public class ThreadTest {

    public static List<Integer> LIST = new Vector<>();
    public static Map map = new Hashtable();

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Thread t = new Thread(new MyRun());
            t.start();
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("---------list共有" + LIST.size() + "个数据");
    }

}
