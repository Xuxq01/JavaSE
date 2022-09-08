package com.itheima.methoddemo;

import java.util.Scanner;

public class MethodDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入长:");
        int a = sc.nextInt();
        System.out.println("请输入宽:");
        int b = sc.nextInt();
        getLength(a,b);
    }
    public static void getLength(int len,int width){
        double result = (len + width) * 2;
        System.out.println(result);
    }
}
