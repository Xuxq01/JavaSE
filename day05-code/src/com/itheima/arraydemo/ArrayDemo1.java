package com.itheima.arraydemo;

public class ArrayDemo1 {
    public static void main(String[] args) {

        //格式:
        //静态初始化
        //完整格式:
        //数据类型 [] 数组名 = new 数据类型[]{元素1,元素2,元素3......};
        //简化格式:
        //数据类型 [] 数组名 = {元素1,元素2,元素3......};

        int[] arr1 = new int[]{11,12,13,14};
        int[] arr2={11,12,13,14};

        String[] arr3 = new String[]{"zhangsan","lisi","wangwu"};
        String[] arr4 = {"zhangsan","lisi","wangwu"};

        double[] arr5 = new double[]{1.93,1.75,1.81,1.73};
        double[] arr6 = {1.93,1.75,1.81,1.73};

        System.out.println(arr6);//[D@119d7047 - 地址值 - [表示数组,D表示double类型 - @是一个间隔符号,没有含义
        System.out.println(arr1);//数组的地址是十六进制
    }
}
