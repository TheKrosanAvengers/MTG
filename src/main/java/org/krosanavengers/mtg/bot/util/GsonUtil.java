package org.krosanavengers.mtg.bot.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonUtil {
    public static String toJson(Object object) {
        return new GsonBuilder().excludeFieldsWithoutExposeAnnotation().setPrettyPrinting().create().toJson(object);
    }

    public static <T> T fromJson(String object, Class<T> clazz) {
        return new Gson().fromJson(object, clazz);
    }
}
