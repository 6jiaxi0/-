package com.LJX.HomeWork;

import java.math.BigDecimal;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;



public class System1 {
    private static List<Goal> list;
    private static int ID;
    static {
        list = new ArrayList<>();
        ID = 0;

    }
    public void show_(){
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do{
            System.out.println("---------库存管理系统--------");
            System.out.println("1.商品入库");
            System.out.println("2.商品展示");
            System.out.println("3.删除商品");
            int chase = scanner.nextInt();
           switch(chase){
               case 1:{
                   //添加
                   if (!insert(scanner)) {
                       flag = false;
                   }
                   break;
               }
               case 2:{
                   //显示
                   show();
                   break;
               }
               case 3:{
                   //删除
                   delete(scanner);
                   break;
               }
               default:flag = false;
           }
        }while(flag);
    }

    private boolean delete(Scanner scanner){
        System.out.println("....要删除的编号....");
        int id = scanner.nextInt();
        remove(id);
        System.out.println("商品出库成功,剩余商品数量:");
        show();
        return true;
    }

    public void remove(int id){
        list.remove(id);
    }

    private void show() {
        for (Goal goal : list) {
            System.out.println(goal);
        }
    }

    public boolean insert (Scanner scanner){
        System.out.println("您是否录入商品?");
        String next = scanner.next();
        char c = next.toLowerCase().charAt(0);
        if (c == 'n'){
         return false;
        }
        Goal goal = new Goal();
        System.out.println("输入商品的名称：");
        String name = scanner.next();
        goal.setBrand(name);
        System.out.println("输入商品的价格：");
        BigDecimal price = scanner.nextBigDecimal();
        goal.setPrice(price);
        System.out.println("输入商品的颜色:");
        String color = scanner.next();
        goal.setColor(color);
        System.out.println("输入商品的数量：");
        Integer integer = scanner.nextInt();
        goal.setNumber(integer);
        goal.setID(ID++);
        list.add(goal);

        return true;
    }




}
