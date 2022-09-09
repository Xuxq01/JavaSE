package collection;

import java.util.ArrayList;
import java.util.Collection;

/*
深入Collection集合的contains方法:
    boolean contains(Object o)
        判断集合中是否包含某个对象o
        如果包含返回true,如果不包含返回false
 */
public class CollectionTest04 {
    public static void main(String[] args) {
        //创建集合对象
        Collection c = new ArrayList();

        String s1 = new String("abc");
        c.add(s1);

        String s2 = new String("def");
        c.add(s2);

        //集合中元素的个数
        System.out.println("元素的个数是: " + c.size());//2

        String x = new String("abc");
        System.out.println(c.contains(x));//contains底层调用了equals方法,x和s1内容相同,所以是true
    }
}
