package collection;

import java.util.HashSet;
import java.util.Set;

public class MyClass {
    //声明一个静态内部类
    private static class InnerClass{
        public static void m1(){
            System.out.println("静态内部类的m1方法执行");
        }

        public void m2(){
            System.out.println("静态内部类的实例方法执行");
        }
    }

    public static void main(String[] args) {
        MyClass.InnerClass.m1();
        InnerClass ic = new InnerClass();
        ic.m2();

        Set<MyClass.InnerClass> set = new HashSet<>();

        Set<MyMap.MyEntry<Integer,String>> set3 = new HashSet<>();
    }
}

class MyMap{
    public static class MyEntry<K,V>{

    }
}