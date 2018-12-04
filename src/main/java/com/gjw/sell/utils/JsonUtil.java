package com.gjw.sell.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @author gjw19
 * @date 2018/12/3
 */
public class JsonUtil {

    public static String toJson(Object object) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();
        return gson.toJson(object);
    }
}
