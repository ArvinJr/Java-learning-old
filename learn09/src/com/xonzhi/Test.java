package com.xonzhi;

import java.util.Arrays;

/**
 * @author arvin
 * @date 2021/2/17
 */
public class Test {

    public static void main(String[] args) {
        int[] arr1 = new int[100000];
        int[] arr2 = new int[100000];

        for (int i = 0; i < 100000; i++) {
            arr1[i] = i * 3;
            arr2[i] = i * 5;
        }

        long start = System.currentTimeMillis();
        // 把两个有序数组合并成一个数组，还有序
        int[] concat = concat2(arr1,arr2);
        long end = System.currentTimeMillis();
        System.out.println(end-start);

    }

    private static int[] concat2(int[] a1, int[] a2){

        // 创建一个新数组
        int[] temp = new int[a1.length + a2.length];

        int left = 0;
        int right = 0;
        int newIndex = 0;

        while (a1.length != left && a2.length != right){
            if (a1[left] > a2[right]){
                temp[newIndex] = a2[right];
                right++;
            }else {
                temp[newIndex] = a1[left];
                left++;
            }
            newIndex++;
        }

        if (a1.length == left){
            for (int i = right; i < a2.length; i++) {
                temp[newIndex++] = a2[i];
            }
        }else if (a2.length == right){
            for (int i = left; i < a1.length; i++) {
                temp[newIndex++] = a1[i];
            }
        }
        return temp;
    }

    private static int[] concat(int[] a1, int[] a2){
        // 创建一个新数组
        int[] temp = new int[a1.length + a2.length];
        // 把旧的放在新的
        for (int i = 0; i < a1.length; i++) {
            temp[i] = a1[i];
        }
        for (int i = a1.length; i < temp.length; i++) {
            temp[i] = a2[i - a1.length];
        }

        for (int i = 0; i < temp.length - 1; i++) {
            for (int j = 0; j < temp.length - i - 1; j++) {
                if (temp[j] > temp[j+1]){
                    int t = temp[j];
                    temp[j] = temp[j+1];
                    temp[j+1] = t;
                }
            }
        }

        return temp;
    }

}
