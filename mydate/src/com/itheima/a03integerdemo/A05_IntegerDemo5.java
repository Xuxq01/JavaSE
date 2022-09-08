package com.itheima.a03integerdemo;

import java.util.Scanner;

public class A05_IntegerDemo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        /*String str = sc.next();
        System.out.println(str);*/
        //弊端:
        //当我们使用next,nextInt,nextDouble在接收数据的时候遇到空格,回车,或者制表符会停止
        //键盘录入123 123,只会接受空格前的数据
        //约定:
        //以后我们想要键盘录入,不管什么类型,统一使用nextLine方法
        //特点:遇到回车停止
        String line = sc.nextLine();
        System.out.println(line);

        /*int i = Integer.parseInt(line);
        System.out.println(i);*/

        double v = Double.parseDouble(line);
        System.out.println(v + 1);
    }
}
