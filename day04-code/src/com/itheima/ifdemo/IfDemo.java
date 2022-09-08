package com.itheima.ifdemo;

import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入酒量:");
        int wine = sc.nextInt();
        if(wine>2) {
            System.out.println("小伙子,不错哦!!!");
        }
        else
            System.out.println("小伙子,不行啊!!!");
    }
}
