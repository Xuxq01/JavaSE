package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        while (true) {
            System.out.println("\"-------------欢迎来到黑马学生管理系统----------------\"\n" +
                    "\"1：添加学生\"\n" +
                    "\"2：删除学生\"\n" +
                    "\"3：修改学生\"\n" +
                    "\"4：查询学生\"\n" +
                    "\"5：退出\"\n" +
                    "\"请输入您的选择:\"");
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            switch (choose) {
                case "1" -> addStudent(list);
                case "2" -> delStudent(list);
                case "3" -> updStudent(list);
                case "4" -> inqStudent(list);
                case "5" -> {
                    System.out.println("退出");
                    System.exit(0);
                }
                default -> System.out.println("没有这个选项");
            }
        }
    }

        public static void addStudent(ArrayList<Student> list){
            Student stu = new Student();

            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println("请输入id");
                String id = sc.next();

                boolean flag = contains(list,id);

                if(flag){
                    System.out.println("id已经存在,请重新录入");
                }else{
                    stu.setId(id);
                    break;
                }
            }

            System.out.println("请输入姓名");
            String name = sc.next();
            stu.setName(name);
            System.out.println("请输入年龄");
            int age = sc.nextInt();
            stu.setAge(age);
            System.out.println("请输入住址");
            String address = sc.next();
            stu.setAddress(address);

            list.add(stu);
            System.out.println("添加成功");
        }

        public static void delStudent(ArrayList<Student> list){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入要删除的id");
            String id = sc.next();

            int index = getIndex(list,id);

            if(index >= 0){
                list.remove(index);
                System.out.println("id为" + id + "的学生删除成功");
            }else{
                System.out.println("id不存在,删除失败");
                return;
            }
        }

        public static void updStudent(ArrayList<Student> list){
            System.out.println("请输入要修改的id");
            Scanner sc = new Scanner(System.in);
            String id = sc.next();

            int index = getIndex(list,id);
            if(index == -1){
                System.out.println("要修改的id" + id + "不存在,请重新输入");
                return;
            }else{
                Student stu = list.get(index);
                System.out.println("请输入要修改的学生姓名");
                String newName = sc.next();
                stu.setName(newName);

                System.out.println("请输入要修改的学生年龄");
                String newAge = sc.next();
                stu.setName(newAge);

                System.out.println("请输入要修改的学生住址");
                String newAdress = sc.next();
                stu.setName(newAdress);
            }
            System.out.println("修改完成");
        }

        public static void inqStudent(ArrayList<Student> list){
            if(list.size() == 0){
                System.out.println("当前无学生信息,请添加后再查询");
                return;
            }

            System.out.println("id\t\t姓名\t年龄\t家庭地址\t");

            for (int i = 0; i < list.size(); i++) {
                Student stu = list.get(i);
                System.out.println(stu.getId() + "\t"+ stu.getName() + "\t" + stu.getAge() + "\t" + stu.getAddress());
            }
        }

        public static boolean contains(ArrayList<Student> list,String id){
            return getIndex(list,id) >= 0;
        }

        public static int getIndex(ArrayList<Student> list,String id){
            for (int i = 0; i < list.size(); i++) {
                Student stu = list.get(i);
                String sid = stu.getId();
                if(sid.equals(id)){
                    return i;
                }
            }
            return -1;
        }
    }
