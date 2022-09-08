package com.itheima.a02interfacetest2;

public class Test {
    public static void main(String[] args) {
        PingPangAthlete pps = new PingPangAthlete("刘诗雯",23);
        System.out.println(pps.getName() + ", " + pps.getAge());
        pps.study();
        pps.speakEnglish();
    }
}
