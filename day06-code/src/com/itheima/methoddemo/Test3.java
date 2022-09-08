package com.itheima.methoddemo;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入起始位置:");
        int from = sc.nextInt();
        System.out.println("请输入结束位置:");
        int to = sc.nextInt();

        int[] copyArr = copyOfRange(arr,from,to);

        for (int i = 0; i < copyArr.length; i++) {
            System.out.print(copyArr[i] + " ");
        }

    }

    public static int[] copyOfRange(int[] arr,int from,int to){
        int[] newArr = new int[to - from];
        for(int i = 0;from<to;from++,i++){
            newArr[i] = arr[from];
        }
        return newArr;
    }
}
