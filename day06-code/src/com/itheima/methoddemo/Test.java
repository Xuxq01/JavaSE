package com.itheima.methoddemo;

public class Test {
    public static void main(String[] args) {

        //compare(10,20);

        compare((byte)10,(byte)20);
    }

    //相同功能的方法名起成一样的
    //调用方法也不麻烦 - 方法的重载
    //不看返回类型,只要方法名一样,参数类型或个数或顺序不同就是重载
    public static void compare(byte b1,byte b2){
        System.out.println("byte");
        System.out.println(b1==b2);
    }

    public static void compare(short s1,short s2){
        System.out.println("short");
        System.out.println(s1==s2);
    }

    public static void compare(int i1,int i2){
        System.out.println("int");
        System.out.println(i1==i2);
    }

    public static void compare(long l1,long l2){
        System.out.println("long");
        System.out.println(l1==l2);
    }
}
