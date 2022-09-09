package collection;

import java.util.ArrayList;
import java.util.Collection;

/*
关于java.util.Collection接口中常用的方法
    1.Collection中能存放什么元素
        没有使用"泛型"之前,Collection中可以存储Object的所有子类
        使用了"泛型"之后,Collection中只能存放某个具体的类型
        集合后学习"泛型"语法,目前不用管,Collection中什么都能存
        只要是object的子类型就行(集合中不能存放基本数据类型,也不能存java对象,只能存java对象的内存地址)
    2.Collection中的常用方法
        boolean add(object e) 向集合中添加元素
        int size() 获取集合中元素的个数
        void clear() 清空集合
        boolean contains(Object a) 判断当前集合中是否包含元素,包含返回true,不包含返回false
        boolean isEmpty() 判断该集合中元素的个数是否为0
        Object[] toArray() 调用这个方法可以把集合转化成数组
*/
public class CollectionTest01 {
    public static void main(String[] args) {
        //创建一个集合对象
        //Collection c = new Collection;// 接口是抽象的,无法实例化
        //多态
        Collection c = new ArrayList();
        //测试Collection接口中的常用方法
        c.add(1200);//自动装箱,实际上是放进去了一个对象的内存地址.Integer x = newInteger(1200);
        c.add(3.14);//自动装箱
        c.add(new Object());
        c.add(new Student());
        c.add(true);

        //获取集合中元素的个数
        System.out.println("集合中元素的个数是: " + c.size());//5

        //清空集合
        c.clear();
        System.out.println("集合中元素的个数是: " + c.size());//0

        //向集合中添加元素
        c.add("hello");//"hello"对象的内存地址放到集合中
        c.add("world");
        c.add("hack");
        c.add("baby");
        c.add(1);

        //判断集合中是否包含"baby"
        boolean flag = c.contains("baby");
        System.out.println(flag);
        boolean flag2 = c.contains("baby2");
        System.out.println(flag2);
        System.out.println(c.contains(1));

        System.out.println("集合中元素的个数是: " + c.size());//5

        //删除集合中的某个元素
        c.remove(1);
        System.out.println("集合中元素的个数是: " + c.size());//4

        //判断集合是否为空(是否存在元素)
        System.out.println(c.isEmpty());//false
        c.clear();
        System.out.println(c.isEmpty());//true

        c.add("abc");
        c.add("def");
        c.add(100);
        c.add("Hello World");
        c.add(new Student());

        //转换成数组(使用不多,了解就好)
        Object[] objs = c.toArray();
        for (int i = 0; i < objs.length; i++) {
            System.out.println(objs[i]);
        }
    }
}

class Student{

}
