package collection;

import java.util.Set;
import java.util.TreeSet;

/*
TreeSet集合存储元素
    1.无需不可重复,但存储的元素可以自动按照大小顺序排序
    称为:可排序集合
 */
public class TreeSetTest01 {
    public static void main(String[] args) {
        Set<String> strs = new TreeSet<>();

        strs.add("A");
        strs.add("B");
        strs.add("Z");
        strs.add("Y");
        strs.add("Z");
        strs.add("K");
        strs.add("M");
        //从小到大自动排序
        for(String s: strs){
            System.out.println(s);
        }
    }
}
