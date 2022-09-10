package collection;

import java.util.ArrayList;
import java.util.List;

/*
ArrayList集合:
    1.默认初始化容量是10(底层先创建一个长度为0的数组,当添加第一个元素的时候初始化容量10)
    2.集合底层是一个Object数组
    3.构造方法:
        new ArrayList();
        new ArrayList(20);
    4.扩容为原容量的1.5倍
    5.数组优点:
        检索效率比较高(每个元素占用空间大小相同,内存地址是连续的,知道首元素内存地址,
        然后找到下标,通过数学表达式计算出元素的内存地址,所以检索效率最高)
    6.数组缺点
        随即增删元素效率比较低
    7.数组向数组末尾添加元素效率很高,不受影响
    8.这么多的集合中用哪个集合最多?  ArrayList
        因为往数组末尾添加元素效率不受影响,另外检索/查询某个元素的次数比较多

 */
public class ArrayListTest01 {
    public static void main(String[] args) {
        //默认初始化容量是10
        List list1 = new ArrayList();
        System.out.println(list1.size());//size()方法获取的是当前集合中元素的个数,不是集合的容量
        //指定初始化容量
        List list2 = new ArrayList(20);
        System.out.println(list2.size());//0
    }
}
