package com.LJX.System;
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
