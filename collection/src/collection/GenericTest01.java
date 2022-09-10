package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
JDK5.0以后推出的新特性:泛型

 */
public class GenericTest01 {
    public static void main(String[] args) {
        /*
        //不使用泛型,分析程序存在缺点
        List myList = new ArrayList();
        //准备对象
        Cat c = new Cat();
        Bird b = new Bird();
        //将对象添加到集合当中
        myList.add(c);
        myList.add(b);

        //遍历集合,取出每个Animal,让他move
        Iterator it = myList.iterator();
        while(it.hasNext()){
            Object obj = it.next();
            //obj中没有move方法,无法调用,需要向下转型
            if(obj instanceof Animal){
                Animal a = (Animal) obj;
                a.move();
            }
        }
         */

        //使用泛型机制
        //使用泛型List<Animal>之后,表示List集合中只允许存储Animal类型的数据
        List<Animal> myList = new ArrayList<Animal>();
        //指定List集合中只能存放Animal,那么存储String就编译报错了
        //这样用了泛型之后,集合中元素的数据类型就更加统一了
        //myList.add("abc");

        Cat c = new Cat();
        Bird b = new Bird();
        myList.add(c);
        myList.add(b);

        //获取迭代器
        Iterator<Animal> it = myList.iterator();
        while (it.hasNext()){
            //使用泛型之后,每一次迭代返回的数据类型都是Animal类型
            Animal a = it.next();
            //不需要进行强制类型转换
            a.move();
            //调用子类型特有的方法还是要向下转换的
            if(a instanceof Cat){
                Cat x = (Cat) a;
                x.catchMouse();
            }
            if(a instanceof Bird){
                Bird y = (Bird) a;
                y.fly();
            }
        }

    }
}

class Animal{
    public void move(){
        System.out.println("动物在移动!");
    }
}

class Cat extends Animal{
    public void catchMouse(){
        System.out.println("猫抓老鼠!");
    }
}

class Bird extends Animal{
    public void fly(){
        System.out.println("鸟在飞!");
    }
}
