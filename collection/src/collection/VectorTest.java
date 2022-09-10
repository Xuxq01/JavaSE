package collection;

import java.util.*;

/*
Vector:
    1.底层也是一个数组
    2.初始化容量:10
    3.扩容:原容量的2倍
    4.
    5.Vector中所有的方法都是线程同步的,都带有synchronized关键字
    是线程安全的,效率低,使用少

 */
public class VectorTest {
    public static void main(String[] args) {
        //创建一个Vector集合
        List vector = new Vector();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        vector.add(6);
        vector.add(7);
        vector.add(8);
        vector.add(9);vector.add(10);
        //满了之后扩容(20)
        vector.add(11);

        Iterator it = vector.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //这个可能以后会使用
        List myList = new ArrayList();//非线程安全的
        //变成线程安全的
        Collections.synchronizedList(myList);
        //myList变成线程安全的了
        myList.add("111");
        myList.add("222");
        myList.add("333");
    }
}
