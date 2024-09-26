package com.LJX.国庆作业.calculator;

import java.util.Scanner;

/**
 * 实现界面展示
 */
public class View {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("欢迎使用简易计算器！");
        System.out.println("这个数字一:");
        double param1 = scanner.nextDouble();
        //Limited to 5 call deep for free version
        System.out.println("这个数字二:");
        double param2 = scanner.nextDouble();
        System.out.println("这个运算符:");
        String operator = scanner.next();

        Operation operationObj = operationFactory.createOperationObj(operator, param1, param2);
        System.out.println(param1 +" "+ operator.charAt(0) +" "+ param2 + " = " + operationObj.getResult());
    }
}