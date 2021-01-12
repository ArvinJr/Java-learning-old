package com.xinzhi;

/**
 * @author arvin
 * @date 2021/1/2
 */
public class Test {
    public static void main(String[] args) {

        Super<User> s = new SuperArray<>();
        s.add(new User("fsdfs","123"));
        s.add(new User("fsdfs2","1223"));

        s.print();
    }
}
