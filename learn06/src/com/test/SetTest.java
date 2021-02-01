package com.test;

import org.junit.Test;

import java.util.HashSet;
import java.util.Map;

/**
 * @author arvin
 * @date 2021/2/1
 */
public class SetTest {

    @Test
    public void test1(){
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(5);

        for (Integer i : hashSet){
            System.out.println(i);
        }
    }
}
