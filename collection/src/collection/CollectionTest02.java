package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
关于集合遍历/迭代专题(重点)
 */
public class CollectionTest02 {
    public static void main(String[] args) {
        //注意:以下的遍历/迭代方式,是所有Collection通用的一种方式
        //在Map集合中不能用,在所有的Collection以及子类中使用
        //创建集合对象
        Collection c = new ArrayList();//后面的集合无所谓,主要看Collection接口,怎么遍历/迭代
        c.add("abc");
        c.add("def");
        c.add(100);
        c.add(new Object());
        //对集合Collection进行遍历/迭代
        //第一步:获取集合对象的迭代器对象
        Iterator it = c.iterator();//迭代器是一个对象
        //第二步:通过以上获取的迭代器对象开始迭代/遍历集合
        /*
            以下两个方法是迭代器对象Iterator中的方法
                boolean hasNext() 如果仍有元素可以迭代，则返回 true。
                Object next() 返回迭代的下一个元素。

        void remove() 从迭代器指向的 collection 中移除迭代器返回的最后一个元素（可选操作）。
         */
        while(it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }
        /*boolean hasNext = it.hasNext();
        if(hasNext){
            //不管当初存进去什么,取出来的统一都是Object
            Object obj = it.next();
            System.out.println(obj);
        }

        hasNext = it.hasNext();
        if(hasNext){
            Object obj = it.next();
            System.out.println(obj);
        }*/
    }
}
