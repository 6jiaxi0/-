package com.LJX.System;

/**
 * 在一所学校中，对学生人员流动的管理是很麻烦的，本案例要求编写一个学生管理系统，实现对学生信息的添加、删除、修改和查询功能。
 * 每个功能的具体要求如下：
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
 *
 * （6）退出功能：用户选择该功能后，程序正常关闭。
 */

/**
 * 学生学号、姓名、年龄和居住地的基本信息
 */

public class Student {
    private String ID;
    private String name;
    private short age;
    private String living;


    public Student() {
    }

    public Student(String ID, String name, short age, String living) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.living = living;
    }

    /**
     * 获取
     * @return ID
     */
    public String getID() {
        return ID;
    }

    /**
     * 设置
     * @param ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public short getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(short age) {
        this.age = age;
    }

    /**
     * 获取
     * @return living
     */
    public String getLiving() {
        return living;
    }

    /**
     * 设置
     * @param living
     */
    public void setLiving(String living) {
        this.living = living;
    }

    public String toString() {
        return "Student{ID = " + ID + ", name = " + name + ", age = " + age + ", living = " + living + "}";
    }
}
