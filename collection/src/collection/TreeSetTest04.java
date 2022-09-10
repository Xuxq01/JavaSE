package collection;

import java.util.TreeSet;

/*
先按照年龄升序,如果年龄一样的再按照姓名升序
 */
public class TreeSetTest04 {
    public static void main(String[] args) {
        TreeSet<Vip> vips = new TreeSet<>();
        vips.add(new Vip("zhangsan",20));
        vips.add(new Vip("zhangsi",20));
        vips.add(new Vip("king",18));
        vips.add(new Vip("soft",17));
        for(Vip vip:vips){
            System.out.println(vip);
        }
    }
}

class Vip implements Comparable<Vip>{
    String name;
    int age;

    public Vip() {
    }

    public Vip(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Vip{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Vip v) {
        if(this.age == v.age){
            //年龄相同时按照名字排序
            return this.name.compareTo(v.name);
        }else{
            return this.age - v.age;
        }
    }
}