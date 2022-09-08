package com.itheima.methoddemo;

public class MethodDemo4 {
    public static void main(String[] args) {

        getSum(10,20,30);
        int sum = getSum(10,20,30);
        System.out.println(sum);
        System.out.println(getSum(10,20,30));
    }

    public static int getSum(int num1,int num2,int num3){
        int result = num1 + num2 + num3;
        return result;
    }
}
