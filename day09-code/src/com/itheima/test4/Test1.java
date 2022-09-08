package com.itheima.test4;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String str;
        while (true) {
            str = sc.next();
            boolean flag = checkStr(str);
            if(flag){
                break;
            }else{
                System.out.println("当前字符串不符合规则,请重新输入");
                continue;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);//拿到的是字符
            int number = c - 48;
            String s = changeLuoMa(number);
            sb.append(s);
        }

        System.out.println(sb);
    }

    public static String changeLuoMa(int number){
        String[] arr = {"","Ⅰ","Ⅱ","Ⅲ","Ⅳ","Ⅴ","Ⅵ","Ⅶ","Ⅷ","Ⅸ"};
        return arr[number];
    }

    public static boolean checkStr(String str){
        if(str.length() > 9){
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c < '0' || c > '9'){
                return false;
            }
        }
        return true;
    }


}
