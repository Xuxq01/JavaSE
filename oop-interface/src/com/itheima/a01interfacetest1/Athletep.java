package com.itheima.a01interfacetest1;

public class Athletep extends Person implements InterEnglish{
    public Athletep() {
    }

    public Athletep(String name, int age) {
        super(name, age);
    }

    @Override
    public void action() {
        System.out.println("学打乒乓球");
    }

    @Override
    public void speak() {
        System.out.println("说英语");
    }
}
