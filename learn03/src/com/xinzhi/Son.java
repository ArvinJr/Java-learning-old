package com.xinzhi;

/**
 * @author arvin
 * @date 2021/1/3
 */
public class Son extends Father {
    public Son(){
        super("烫头");
        System.out.println("123");
    }

    public void swim(){
        super.smoke();
        System.out.println("我的爱好是：" + getHobby());
    }

    @Override
    public void smoke(){
        System.out.println("我爱抽红塔山！");
    }
}
