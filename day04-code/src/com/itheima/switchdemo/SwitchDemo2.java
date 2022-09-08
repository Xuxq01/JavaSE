package com.itheima.switchdemo;

public class SwitchDemo2 {
    public static void main(String[] args) {
        int number = 1;
        switch(number){//省略break
            case 1 -> {
                System.out.println("一");
            }
            case 2 ->{
                System.out.println("二");
            }
            case 3 -> {
                System.out.println("三");
            }
            case 4 -> {
                System.out.println("四");
            }
            default -> {
                System.out.println("没有");
            }
        }
    }
}
