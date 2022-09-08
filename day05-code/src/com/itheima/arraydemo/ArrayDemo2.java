package com.itheima.arraydemo;

public class ArrayDemo2 {
    public static void main(String[] args) {
        //1.获取数组里面的元素
        //格式:  数组名[索引];

        int[] arr = {1,2,3,4,5};
        int number = arr[0];
        System.out.println(number);
        System.out.println(arr[1]);

        //2.把数据存储到数组当中
        //格式:  数组名[索引] = 具体数据/变量;

        arr[0] = 100;
        System.out.println(arr[0]);

    }
}
