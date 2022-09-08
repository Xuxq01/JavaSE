package com.itheima.a01interfacetest1;

public class Coachb extends Person{
    public Coachb() {
    }

    public Coachb(String name, int age) {
        super(name, age);
    }

    @Override
    public void action() {
        System.out.println("教打篮球");
    }
}
