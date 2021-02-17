package com.xinzhi;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

/**
 * @author arvin
 * @date 2021/2/5
 */
public class UtilTest {

    @Test
    public void testArrays(){
        int[] nums = {1,2,4,5,8,9,12};

        int i = Arrays.binarySearch(nums,9);
        System.out.println(i);

        sum(1,2,3,5,3,6);
    }

    public int sum(int... nums){
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }

    @Test
    public void testMath(){
        System.out.println(Math.abs(-1));
    }

    @Test
    public void testDate(){
        Date date = new Date();
        long time = date.getTime();
        time -= 60000;
        date = new Date(time);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String format = simpleDateFormat.format(date);
        System.out.println(format);
    }

    @Test
    public void testCalendar(){
        Calendar calendar = Calendar.getInstance();
        calendar.setFirstDayOfWeek(Calendar.MONDAY);
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
    }
}
