package com.LJX.国庆作业.calculator;

/**
 * 生成对应操作的工厂
 */
public class operationFactory {

    public static Operation createOperationObj(String operator, double p1, double p2) {
            switch (operator) {
                case "+": return new add().setParam1(p1).setParam2(p1);
                case "-": return new subtract().setParam1(p1).setParam2(p1);
                case "*": return new mult().setParam1(p1).setParam2(p2);
                case "/": return new minus().setParam1(p1).setParam2(p2);
                default:
                    System.out.println("错误：无效的运算符！");;
            }
            return null;
    }

}
