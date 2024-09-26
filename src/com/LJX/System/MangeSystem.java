package com.LJX.System;

import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class MangeSystem{
    /**
     * 存储学生的列表
     */
    private  List<Student> list;

    private MangeSystem(){
        list = new ArrayList<>();
    }

    /**
     * 开启系统，返回系统对象，由View层调用
     * @return
     */
    public static MangeSystem start0(){
        return new MangeSystem();
    }

    /**
     * （2）查询功能：用户选择该功能后，在控制台打印所有学生的信息。
     */
        public void viewStudents(){
            if(list.size() == 0){
                System.out.println("毛个学生！！！");
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
    public void addStudent(Scanner scanner){
       while (true){
           System.out.println("输入学生学号");
           String id = scanner.next();
           if(hasRepeatId(id)){
               System.out.println("学号重复！！！ try again");
               continue;
           }
           System.out.println("输入学生姓名");
           String name = scanner.next();
           System.out.println("输入学生年龄");
           short age = scanner.nextShort();
           System.out.println("输入学生居住地");
           String living = scanner.next();
           Student s1 =  new Student(id, name, age, living);
           insertNewStudent(s1);
           break;
       }
    }



    private void insertNewStudent(Student s1) {
        list.add(s1);
    }

    /**
     * 判断学号是否被占用
     */
    public boolean hasRepeatId(String id){
        for (int i = 0; i < list.size(); i++) {
            Student anStudent = list.get(i);
            if(id.equals(anStudent.getID())){
                return true;
            }
        }
        return false;
    }
    /**
     * （4）删除功能：用户选择该功能后，提示用户在控制台输入需要删除学生的学号，如果用户输入的学号存在则提示删除成功，反之则提示删除失败
     */
   public void deleteStudent(Scanner scanner){
     while (true){
         System.out.println("输入要删除的学号");
         String id = scanner.next();
         if(!hasRepeatId(id)){
             System.out.println("删除失败！！！");
             continue;
         }
         deleteStudentList(id);
         break;
     }
   }

    private void deleteStudentList(String id) {
        for (int i = 0; i < list.size(); i++) {
            Student anStu = list.get(i);
            if(id.equals(anStu.getID())){
                list.remove(i);
            }
        }
    }

    /**
     * * （5）修改功能：用户选择该功能后，提示用户在控制台输入需要修改的学生学号、姓名、年龄和居住地学生信息，并使用输入的学生学号判断是否有此人
     *  * 如果有则修改原有的学生信息，反正则提示需要修改的学生信息不存在。
     * @param scanner
     */
    public void modifyStudent(Scanner scanner) {
        while (true){
            System.out.println("输入学生学号");
            String id = scanner.next();
            Student waitToUpdate = getById(id);
            if (waitToUpdate == null) {
                System.out.println("学生不存在@!!!!!");
                continue;
            }
            System.out.println("输入学生姓名");
            String name = scanner.next();
            waitToUpdate.setName("".equals(name) ? waitToUpdate.getName(): name);
            System.out.println("输入学生年龄");
            short age = scanner.nextShort();
            waitToUpdate.setAge(age);
            System.out.println("输入学生居住地");
            String living = scanner.next();
            waitToUpdate.setLiving(living);
            System.out.println("更改完成！！！");
            break;
        }
    }

    public Student getById(String id){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getID().equals(id)){
                return list.get(i);
            }
        }
        return null;
    }

}
