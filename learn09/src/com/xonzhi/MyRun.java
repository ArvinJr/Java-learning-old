package com.xonzhi;

/**
 * @author arvin
 * @date 2021/2/17
 */
public class MyRun implements Runnable {

    @Override
    public void run() {

        System.out.println("添加了一个数据");
        for (int i = 0; i < 100; i++) {
            ThreadTest.LIST.add(i);
        }
    }
}
