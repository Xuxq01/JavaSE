package collection;

import java.util.*;

/*
java.util.Collection 集合接口
java.util.Collections 集合工具类,方便集合的操作
 */
public class CollectionsTest {
    public static void main(String[] args) {
        //ArrayList集合不是线程安全的
        List<String> list = new ArrayList<>();

        //变成线程安全的
        Collections.synchronizedList(list);

        //排序
        list.add("abc");
        list.add("abx");
        list.add("abf");
        list.add("abe");
        Collections.sort(list);
        for(String s:list){
            System.out.println(s);
        }

        List<turtle2> turtles = new ArrayList<>();
        turtles.add(new turtle2(1000));
        turtles.add(new turtle2(8000));
        turtles.add(new turtle2(500));
        //对List集合中元素排序,需要保证List中的元素实现了Comparable接口
        Collections.sort(turtles);
        for(turtle2 t:turtles){
            System.out.println(t);
        }

        //对Set集合排序
        Set<String> set = new HashSet<>();
        set.add("king");
        set.add("kingsoft");
        set.add("king2");
        set.add("king1");
        //将Set集合转换成List
        List<String> myList = new ArrayList<>(set);
        Collections.sort(myList);
        for(String s:myList){
            System.out.println(s);
        }
        //这种方式也可以
        //Collections.sort(myList,Comparator);
    }
}

class turtle2 implements Comparable<turtle2>{
    int age;
    public turtle2(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return "乌龟{" +
                "age=" + age +
                '}';
    }

    @Override
    public int compareTo(turtle2 o) {
        return this.age - o.age;
    }
}
