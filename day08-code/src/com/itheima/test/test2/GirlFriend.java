package com.itheima.test.test2;

public class GirlFriend {
    //属性
    private String name;
    private int age;
    private String gender;

    //针对每一个私有化的成员变量,都要提供get和set方法
    //set方法:给成员变量赋值
    //get方法:对外提供成员变量的值

    public void setName(String n){
        name = n;

    }

    public String getName(){
        return name;
    }


    public void setAge(int a){
        if(a>=18&&a<=23){
            age = a;
        }else{
            System.out.println("非法参数");
        }
    }

    public int getAge(){
        return age;
    }


    public void setGendre(String g){
        gender = g;
    }

    public String getGender(){
        return gender;
    }

    //行为
    public void sleep() {
        System.out.println("女朋友在睡觉");
    }

    public void eat() {
        System.out.println("女朋友在吃饭");
    }
}
