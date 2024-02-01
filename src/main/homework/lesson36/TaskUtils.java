package main.homework.lesson36;

import java.util.HashMap;
import java.util.Map;

public class TaskUtils {
    public static Map<String, Boolean> task1(String[] arr) {
        Map<String, Boolean> repeat = new HashMap<String, Boolean>();
        for (String item : arr) {
            Boolean isEven = repeat.getOrDefault(item, true);
            repeat.put(item, !isEven);
        }
        return repeat;
    }

    public static Map<String, String> task2(String[] arr) {
        Map<String, String> map = new HashMap<String, String>();
        for (String str : arr) {
            String key = String.valueOf(str.charAt(0));
            String value = String.valueOf(str.charAt(str.length() - 1));
            map.put(key, value);
        }
        return map;
    }
}
