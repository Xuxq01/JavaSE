package com.itheima.a03integerdemo;

public class A04_IntegerDemo4 {
    public static void main(String[] args) {
        //1.整数转为二进制
        String str1 = Integer.toBinaryString(100);
        System.out.println(str1);//1100100

        //2.整数转为八进制
        String str2 = Integer.toOctalString(100);
        System.out.println(str2);//144

        //3.整数转为十六进制
        String str3 = Integer.toHexString(100);
        System.out.println(str3);//64


        int i = Integer.parseInt("123");
        System.out.println(i);
        System.out.println(i + 1);

        //8种包装类中,除了Character都有对应的parseXxx方法进行类型转换
        String str = "true";
        boolean b = Boolean.parseBoolean(str);
        System.out.println(b);

    }
}
