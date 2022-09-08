package com.itheima.test;

import java.util.Random;

public class LoopTest1 {
    public static void main(String[] args) {
        Random r = new Random();
        //随机生成0开始到输入数字-1的随机数
        int number = r.nextInt(100);//0~99
        System.out.println(number);
    }
}
