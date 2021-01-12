package com.arvin01;

/**
 * @author arvin
 * @date 2021/1/1
 */
public class Fibonacci {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(fibonacci(num));
    }

    public static int fibonacci(int count){
        if (count == 1){
            return 0;
        }else if (count == 2){
            return 1;
        }else if (count < 1){
            return -1;
        }else {
            return fibonacci(count - 1) + fibonacci(count - 2);
        }
    }
}
