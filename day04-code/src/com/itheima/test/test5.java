package com.itheima.test;

import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int num = sc.nextInt();
        int mem = num;
        int count = 0;
        while(num != 0){
            int plot = num % 10;
            num /= 10;
            count = count * 10 + plot;
        }
        if(count == mem) {
            System.out.println("num是回文数");
        }else{
            System.out.println("num不是回文数");
        }
    }
}
