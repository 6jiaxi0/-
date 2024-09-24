package com.LJX.System;

import java.util.Scanner;

public class view {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("--------欢迎来到学生管理系统--------");
            System.out.println("1 查看所有学生");
            System.out.println("2 添加学生");
            System.out.println("3 删除学生");
            System.out.println("4 修改学生");
            System.out.println("5 退出");
            System.out.print("请输入你的选择：");

            int choice = scanner.nextInt();
            scanner.nextLine(); // 吸收换行符

            switch (choice) {
                case 1:
                  //  viewStudents();
                    break;
                case 2:
                  //  addStudent(scanner);
                    break;
                case 3:
                   // deleteStudent(scanner);
                    break;
                case 4:
                   // modifyStudent(scanner);
                    break;
                case 5:
                    System.out.println("退出系统。");
                    System.exit(0);
                default:
                    System.out.println("无效选择，请重新输入。");
            }
        }
    }
}
