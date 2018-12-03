package com.gjw.sell.utils;

import java.util.Random;

/**
 * @author gjw19
 * @date 2018/12/2
 */
public class KeyUtil {

    public static synchronized String genUniqueKey(){
        Random random = new Random();
        Integer number = random.nextInt(900000)+100000;
        return System.currentTimeMillis() + String.valueOf(number);
    }
}
