package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
关于集合元素的remove
    在迭代集合元素的过程中不能调用remove方法删除元素
 */
public class CollectionTest06 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        //注意:此时获取的迭代器,指向的是集合元素中没有元素的迭代器
        //集合结构只要发生变化,迭代器必须重新获取
        //Iterator it = c.iterator();
        c.add(1);//存的不是1,是new Integer内存地址
        c.add(2);
        c.add(3);

        Iterator it = c.iterator();

        while(it.hasNext()){
            Object obj = it.next();
            System.out.println(obj.toString());//.toString不写也会调用,Integer的toString方法
        }

        Collection c2 = new ArrayList();
        c2.add("abc");
        c2.add("def");
        c2.add("xyz");

        Iterator it2 = c2.iterator();
        while(it2.hasNext()){
            Object o = it2.next();
            //删除元素
            //删除元素后,集合的结构发生了变化,应该重新去获取迭代器
            //但是,循环下一次的时候并没有重新获取,会发生异常
            //c2.remove(o);//出异常的根本原因是集合中删除了,但没有更新迭代器

            //尝试使用迭代器的remove方法删除元素
            it2.remove();//删除的一定是迭代器当前指向的元素,迭代器删除时会自动更新迭代器,并且更新到集合
            System.out.println(o);
        }

        System.out.println(c2.size());//0
    }
}
