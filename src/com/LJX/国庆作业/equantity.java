package com.LJX.国庆作业;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 2 相等性
 * 自定义泛型静态方法Equal 判断两个Map 对象是否相等
 * 所谓相等是指两个Map李含完全相同的键。每个键对应的值也完全相同
 */
public class equantity {

    public static boolean func(Map m1, Map map2){
        if (!(m1.size() == map2.size())) {
            return false;
        }

        for (Object entry : m1.entrySet()) {
            entry = (Map.Entry<Object,Object>) entry;
            if (!map2.get(((Map.Entry<?, ?>) entry).getKey()).equals(((Map.Entry<?, ?>) entry).getValue())) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        HashMap<String, Object> anMap1 = new HashMap<>();
        anMap1.put("fuck", 111);
        HashMap<String, Object> anMap2 = new HashMap<>();
        System.out.println(func(anMap1, anMap2)?"true":"false");
    }
}
