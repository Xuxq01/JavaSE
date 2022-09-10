package collection;

import java.util.TreeSet;

/*
1.TreeSet集合底层实际是一个TreeMap
2.TreeMap集合底层是一个二叉树
3.放到TreeSet集合中的元素,等同于放到TreeMap集合key部分了
4.TreeSet不能对自定义类型排序
 */
public class TreeSetTest02 {
    public static void main(String[] args) {
        Person p1 = new Person(32);
        Person p2 = new Person(20);
        Person p3 = new Person(30);
        Person p4 = new Person(25);

        //没有实现Comparable,会报错
        TreeSet<Person> persons = new TreeSet<>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);

        for(Person p:persons){
            System.out.println(p);
        }
    }
}

class Person{
    int age;
    public Person(int age){
        this.age = age;
    }

    public String toString(){
        return "Person[age=" + age + "]";
    }
}
