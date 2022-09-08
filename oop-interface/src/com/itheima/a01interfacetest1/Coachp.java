package com.itheima.a01interfacetest1;

public class Coachp extends Person implements InterEnglish{
    public Coachp() {
    }

    public Coachp(String name, int age) {
        super(name, age);
    }

    @Override
    public void action() {
        System.out.println("教打乒乓球");
    }

    @Override
    public void speak() {
        System.out.println("说英语");
    }
}
