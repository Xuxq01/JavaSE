package com.itheima.methoddemo;

public class Test2 {
    public static void main(String[] args) {
        int[] arr = {1,4,63,75,12,97};

        int max = getMax(arr);
        System.out.println(max);
    }
    
    public static int getMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max)
                max = arr[i];
        }
        return max;
    }
}
