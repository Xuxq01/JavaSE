package com.itheima.test;

import java.util.Random;

public class ArrTest1 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        Random r = new Random();

        for (int i = 0; i < arr.length; i++) {
            int number = r.nextInt(100) + 1;

            arr[i] = number;
        }

        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<(sum/arr.length)){
                count++;
            }
        }
        System.out.println(sum);
        System.out.println(sum/arr.length);
        System.out.println(count);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");//print去掉ln就不会换行
        }
    }
}
