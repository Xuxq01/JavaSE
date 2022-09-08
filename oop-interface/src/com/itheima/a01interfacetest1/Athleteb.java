package com.itheima.a01interfacetest1;

public class Athleteb extends Person{
    public Athleteb() {
    }

    public Athleteb(String name, int age) {
        super(name, age);
    }

    @Override
    public void action() {
        System.out.println("学打篮球");
    }
}
