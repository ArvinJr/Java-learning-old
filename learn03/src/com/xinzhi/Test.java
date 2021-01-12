package com.xinzhi;

/**
 * @author arvin
 * @date 2021/1/3
 */
public class Test {
    public static void main(String[] args) {
        String a = "1";
        String b = "1";
        System.out.println(a.equals(b));

        Father father1 = new Father("asd");
        Father father2 = new Father("asd");

        System.out.println(father1.equals(father2));

        Son son = new Son();
        father1.fight(son);
    }
}
