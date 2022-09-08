package com.itheima.a04test;

public class Test2 {
    public static void main(String[] args) {
        //1.定义一个字符串
        String str = "123456789";
        //2.校验字符串
        //习惯:会先把异常数据进行过滤,剩下的就是正常数据
        if(!str.matches("[1-9]\\d{0,9}")){
            //错误的数据
            System.out.println("数据格式有误");

        }else{
            //正确的数据
            System.out.println("数据格式正确");

            //3.定义一个变量表示最终的结果
            int number = 0;

            //4.遍历字符串得到里面的每一个字符
            for (int i = 0; i < str.length(); i++) {
                int c = str.charAt(i) - '0';
                //把每一位数字放到number当中
                number = number * 10 + c;
            }
            System.out.println(number + 1);
        }
    }
}
