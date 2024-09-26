package com.LJX.国庆作业;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Function;

/**
 * 3.将 Map 的键值对调
 * 对调是指调换key和value 假定Map 的所有的 value 是唯一的，编写程序将健馆对调 并编写测试程序
 */
public class reverse {
    public static void reversal(Map anMap){
        HashMap<Object, Object>  map = new HashMap<>();
        for (Object o :anMap.entrySet()) {
            o = (Map.Entry)o;
            Object key = ((Map.Entry<?, ?>) o).getKey();
            Object value = ((Map.Entry<?, ?>) o).getValue();
           map.put(value, key);
        }
        for (Object o :map.entrySet()) {
            o = (Map.Entry)o;
            Object key = ((Map.Entry<?, ?>) o).getKey();
            Object value = ((Map.Entry<?, ?>) o).getValue();
            anMap.remove(value);
            anMap.put(key, value);
        }

    }

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("frank", "chinese");
        map.put("小名", "US");
        reversal(map);
        System.out.println(map.toString());
    }
}
