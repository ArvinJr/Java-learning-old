package com.xinzhi;

/**
 * @author arvin
 * @date 2021/1/6
 */
public class Dog implements Animal {
    @Override
    public void breathe() {
        System.out.println("我在呼吸！");
    }

    @Override
    public void eat() {
        System.out.println("狗在吃骨头");
    }
}
