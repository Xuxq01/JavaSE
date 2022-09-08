package com.itheima.a02interfacetest2;

public class PingPangAthlete extends Athlete implements English{
    public PingPangAthlete() {
    }

    public PingPangAthlete(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员在学习如何打乒乓球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球运动员在说英语");
    }
}
