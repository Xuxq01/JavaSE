package collection;

import java.util.HashSet;
import java.util.Set;

/*
HashSet集合无需不可重复
 */
public class HashSetTest01 {
    public static void main(String[] args) {
        Set<String> strs = new HashSet<>();
        strs.add("hello3");
        strs.add("hello4");
        strs.add("hello1");
        strs.add("hello2");
        strs.add("hello3");
        for(String s: strs){
            System.out.println(s);
        }
    }
}
