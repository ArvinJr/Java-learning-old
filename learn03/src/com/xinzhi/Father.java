package com.xinzhi;

/**
 * @author arvin
 * @date 2021/1/3
 */
public class Father {
    private String hobby;

    public Father(String hobby) {
        this.hobby = hobby;
    }

    public void smoke(){
        System.out.println("我爱抽烟！");
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public void fight(Father father) {
        father.smoke();
        this.smoke();
        System.out.println("打架");
    }

    // 重写equals方法
    @Override
    public boolean equals(Object obj) {
        Father father;
        if (obj instanceof Father) {
            father = (Father)obj;
            if (this.getHobby().equals(father.getHobby())) {
                return true;
            }
        }
        return false;
    }
}
