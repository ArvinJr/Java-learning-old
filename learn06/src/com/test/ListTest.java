package com.test;

import org.junit.Test;

import java.util.*;

/**
 * @author arvin
 * @date 2021/2/1
 */
public class ListTest {

    @Test
    public void testArrayList(){
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(5);

        Set<Integer> set = new HashSet<>(list);
        list = new ArrayList<>(set);

        for (Integer integer : list) {
            System.out.println(integer);
        }

        Iterator<Integer> iterator = list.iterator();
    }
}
