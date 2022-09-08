package com.itheima.methoddemo;

import java.util.Scanner;

public class work {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个小数:");
        double num = sc.nextFloat();
        num = getRight(num);
        System.out.println(num);
    }

    public static double getRight(double num){
        return num > 0 ? num : - num;
    }
}
