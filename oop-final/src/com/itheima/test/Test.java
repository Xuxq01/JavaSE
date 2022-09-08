package com.itheima.test;

public class Test {
    public static void main(String[] args) {
        final int a = 10;//常量且必须赋值
        System.out.println(a);
    }
}

final class Fu{//父类不可被继承
    public final void show(){//子类不能重写
        System.out.println("父类的show方法");
    }
}
/*
class Zi extends Fu{

}
*/

//final 修改基本数据类型:记录的值不能发生改变
//final 修改引用数据类型:记录的地址值不能发生改变,内部的属性值是可以改变的