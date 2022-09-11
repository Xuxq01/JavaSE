package collection;

import java.util.Comparator;
import java.util.TreeSet;

/*
TreeSet集合中元素可排序的第二种方式:比较器的方式
 */
public class TreeSetTest05 {
    public static void main(String[] args) {
        //创建TreeSet集合要使用比较器
        //TreeSet<turtle> turtles = new TreeSet<>();//没有传递比较器不行
        //TreeSet<turtle> turtles = new TreeSet<>(new turtleComparator());

        //匿名内部类的方式,new接口
        TreeSet<turtle> turtles = new TreeSet<>(new Comparator<turtle>(){
            @Override
            public int compare(turtle o1, turtle o2) {
                return o1.age - o2.age;
            }
        });

        turtles.add(new turtle(1000));
        turtles.add(new turtle(800));
        turtles.add(new turtle(810));

        for (turtle t:turtles){
            System.out.println(t);
        }
    }
}

class turtle {
    int age;
    public turtle(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return "乌龟{" +
                "age=" + age +
                '}';
    }
}

//单独编写一个比较器

/*
class turtleComparator implements Comparator<turtle> {

    @Override
    public int compare(turtle o1, turtle o2) {
        //指定比较规则
        return o1.age - o2.age;
    }
}
*/
