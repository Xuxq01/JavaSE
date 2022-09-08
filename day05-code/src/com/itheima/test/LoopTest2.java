package com.itheima.test;

import java.util.Random;

public class LoopTest2 {
    public static void main(String[] args) {
        Random r = new Random();
        int number = r.nextInt(100) + 1;//1~100
        System.out.println(number);
    }
}
