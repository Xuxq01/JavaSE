package bean;

import java.util.HashSet;
import java.util.Set;
/*
向map集合中存,以及取,都是先调用key的hashCode方法,然后再调用equals方法
equals方法可能调用也可能不调用
放在HashMap集合key部分的,以及放在HashSet集合中的元素,需要同时重写hashCode方法和equals方法
 */
public class HashMapTest02 {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan");
        Student s2 = new Student("zhangsan");
        System.out.println(s1.equals(s2));

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        //s1.equals(s2)结果为true,表示s1和s2是一样的,那么往HashSet集合放的时候
        //按说只能放一个(无序不可重复)
        Set<Student> students = new HashSet<>();
        students.add(s1);
        students.add(s2);
        System.out.println(students.size());
    }
}
