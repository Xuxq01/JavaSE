package com.itheima.test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票的原价:");
        int ticket = sc.nextInt();
        System.out.println("请输入当前的月份:");
        int month = sc.nextInt();
        System.out.println("请输入当前购买的舱位:(0头等舱,1经济舱)");
        int seat = sc.nextInt();

        if(month>=5&&month<=10){
            if(seat==0){
                ticket = (int)(ticket * 0.9);
            }else if(seat==1){
                ticket = (int)(ticket * 0.85);
            }else{
                System.out.println("没有这个舱位");
            }
        }else if((month>=1&&month<=4)||(month>=11&&month<=12)){
            if(seat==0){
                ticket = (int)(ticket * 0.7);
            }else if(seat==1){
                ticket = (int)(ticket * 0.65);
            }else{
                System.out.println("没有这个舱位");
            }
        }else{
            System.out.println("键盘录入的月份不合法");
        }

        System.out.println(ticket);

    }
    public static int getPrice(int ticket,int seat,double v0,double v1){
        if(seat==0){
            ticket = (int)(ticket * v0);
        }else if(seat==1){
            ticket = (int)(ticket * v1);
        }else{
            System.out.println("没有这个舱位");
        }
        return ticket;
    }
}
