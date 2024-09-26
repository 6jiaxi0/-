package com.LJX.国庆作业;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 模仿Edge
 */
public class EdgeSearch {
    public static Map<String, String> directory = new HashMap<>();
    static {
        directory.put("香蕉", "banner");
        directory.put("banner", "香蕉");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请您输入您要翻译的单词:");
        String keyWord = scanner.next();
        if(directory.get(keyWord) == null){
            System.out.println("你可真是个小可爱!");
        }else{
            System.out.println(keyWord + "的意思是 " + directory.get(keyWord));
        }
    }
}
