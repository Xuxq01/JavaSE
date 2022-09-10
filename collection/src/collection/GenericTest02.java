package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
JDK8后引入了: 自动类型推断机制(又称为:钻石表达式)
 */
public class GenericTest02 {
    public static void main(String[] args) {
        //ArrayList<这里的类型会自动推断>(),前提是JDK8之后才允许
        List<Animal> myList = new ArrayList<>();

        myList.add(new Animal());
        myList.add(new Cat());
        myList.add(new Bird());

        Iterator<Animal> it = myList.iterator();
        while (it.hasNext()){
            Animal a = it.next();
            a.move();
        }

        List<String> strList = new ArrayList<>();
        //strList.add(new Cat());//类型不匹配
        strList.add("abc");
        strList.add("def");
        strList.add("xyz");

        Iterator<String> it2 = strList.iterator();
        while (it2.hasNext()){
            String s = it2.next();//迭代的字符串,所以左边是String不是Object
            System.out.println(s);
        }
    }
}
