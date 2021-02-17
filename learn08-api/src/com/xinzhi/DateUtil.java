package com.xinzhi;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author arvin
 * @date 2021/2/5
 */
public class DateUtil {

    public static String dataToString(Date date){
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        return sf.format(date);
    }

    public static String dataToString(Date date, String patter){
        SimpleDateFormat sf = new SimpleDateFormat(patter);
        return sf.format(date);
    }

}
