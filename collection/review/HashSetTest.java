package review;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("abc");
        set.add("def");
        set.add("king");

        //Set集合中元素没有下标
        Iterator<String>it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
