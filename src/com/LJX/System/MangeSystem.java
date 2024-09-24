package com.LJX.System;

import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;

/*
 * （1）系统的首页：用于显示系统所有的操作，并根据用户在控制台的输入选择需要使用的功能。
 *
 * （2）查询功能：用户选择该功能后，在控制台打印所有学生的信息。
 *
 * （3）添加功能：用户选择该功能后，要求用户在控制台输入学生学号、姓名、年龄和居住地的基本信息。
 * 在输入学号时，判断学号是否被占用，如果被占用则添加失败，并给出相应提示；反之则提示添加成功。
 *
 * （4）删除功能：用户选择该功能后，提示用户在控制台输入需要删除学生的学号，如果用户输入的学号存在则提示删除成功，反之则提示删除失败。
 *
 * （5）修改功能：用户选择该功能后，提示用户在控制台输入需要修改的学生学号、姓名、年龄和居住地学生信息，并使用输入的学生学号判断是否有此人
 * 如果有则修改原有的学生信息，反正则提示需要修改的学生信息不存在。
 */
public class MangeSystem {
    private  List<Student> list;

    private MangeSystem(){
        list = new ArrayList<>();
    }
    public static MangeSystem start0(){
        return new MangeSystem();
    }

    /**
     * （2）查询功能：用户选择该功能后，在控制台打印所有学生的信息。
     */
        public void viewStudents(){
            if(list.size() == 0){
                return;
            }
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        }
    /**
     * （3）添加功能：用户选择该功能后，要求用户在控制台输入学生学号、姓名、年龄和居住地的基本信息。
     *  * 在输入学号时，判断学号是否被占用，如果被占用则添加失败，并给出相应提示；反之则提示添加成功。
     */




}
