package com.xonzhi;

/**
 * @author arvin
 * @date 2021/2/17
 * 懒汉式单例
 */
public class Singleton {

    private static Singleton SINGLETON;

    private Singleton(){}

    public static Singleton getInstance(){
        if (SINGLETON == null){
            SINGLETON = new Singleton();
        }
        return SINGLETON;
    }

}
