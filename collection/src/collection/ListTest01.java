package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
测试List接口中的个常用方法
    1.List集合存储元素的特点:有序可重复
        有序:List集合中的元素有下标
        从0开始以1递增
        可重复:存储1还可以再存储1
    2.List接口既然是Collection的子接口,那么肯定List接口有自己特色的方法
    以下只列出List接口中特有的常用的方法
        void add(int index, E element)
        Object get(int index)
        int indexOf(Object o)
        int lastIndexOf(Object o)
        Object remove(int index)
        Object set(int index, E element)
 */
public class ListTest01 {
    public static void main(String[] args) {
        //创建List类型的集合
        //List myList = new LinkedList();
        List myList = new ArrayList();
        myList.add("A");//默认都是向集合末尾添加元素
        myList.add("B");
        myList.add("C");
        myList.add("C");
        myList.add("D");
        //在列表的指定位置插入指定元素(第一个参数是下标),后续元素默认后移
        //使用不多,对于ArrayList集合来说效率比较低
        myList.add(1,"KING");

        //迭代
        Iterator it = myList.iterator();
        while(it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }

        //根据下标获取元素
        Object firstObj = myList.get(0);
        System.out.println(firstObj);

        //因为有下标,所以List集合有自己比较特殊的遍历方式
        //通过下标遍历
        for (int i = 0; i < myList.size(); i++) {
            Object obj = myList.get(i);
            System.out.println(obj);
        }

        //获取指定对象第一次出现处的索引
        System.out.println(myList.indexOf("KING"));

        //获取指定对象最后一次出现处的索引
        System.out.println(myList.lastIndexOf("C"));

        //删除指定下标位置的元素
        myList.remove(0);
        System.out.println(myList.size());

        System.out.println("====================");

        //修改指定位置的元素
        myList.set(2,"Soft");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }
}
