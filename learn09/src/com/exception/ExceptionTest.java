package com.exception;

/**
 * @author arvin
 * @date 2021/2/17
 */
public class ExceptionTest {

    public static void main(String[] args) {
        User user = new User();
        user.login("a2","b");
    }

    public static void test1() {
        try {
            Thread.sleep(132);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
