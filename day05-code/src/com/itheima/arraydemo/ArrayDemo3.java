package com.itheima.arraydemo;

public class ArrayDemo3 {
    public static void main(String[] args) {
        //1.定义数组
        int[] arr = {1,2,3,4,5};
        //2.获取所有元素
        for(int i = 0;i < 5;i++){
            System.out.println(arr[i]);
        }
        //3.数组名.length
        System.out.println(arr.length);
        //4.数组名.fori - idea专属
        for (int i = 0; i < arr.length; i++) {
            
        }
    }
}
