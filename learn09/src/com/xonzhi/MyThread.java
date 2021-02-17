package com.xonzhi;

/**
 * @author arvin
 * @date 2021/2/17
 */
public class MyThread extends Thread{

    public MyThread(){}

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("我是:" + Thread.currentThread().getName());
        }
    }
}
