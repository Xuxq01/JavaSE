package com.itheima.test4;

public class Test {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.length());
        System.out.println(sb.capacity());

        sb.append("abcdefghijklmnopqrstuvwxyz0123456789");

        System.out.println(sb.length());
        System.out.println(sb.capacity());
    }
}
