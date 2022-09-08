package com.itheima.a02interfacetest2;

public class BasketballAthlete extends Athlete{
    public BasketballAthlete(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("篮球运动员在学习打篮球");
    }
}
