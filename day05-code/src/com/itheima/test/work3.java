package com.itheima.test;

import java.util.Scanner;

public class work3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {12,14,23,45,66,68,70,77,90,91,0};
        System.out.println("请输入一个数字:");
        arr[10] = sc.nextInt();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++){
                if(arr[i]>arr[i+1]){
                    int t = arr[i];arr[i] = arr[i+1];arr[i+1] = t;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
