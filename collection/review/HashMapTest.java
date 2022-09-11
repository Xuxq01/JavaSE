package review;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        Map<Integer,String> map = new Hashtable<>();
        map.put(1,"zhangsan");
        map.put(9,"lisi");
        map.put(10,"wangwu");
        map.put(2,"king");
        map.put(2,"soft");

        System.out.println(map.size());

        System.out.println(map.get(2));

        Set<Integer> keys = map.keySet();
        for(Integer key:keys){
            System.out.println(map.get(key));
        }

        Set<Map.Entry<Integer, String>> nodes = map.entrySet();
        for(Map.Entry<Integer, String> node:nodes){
            System.out.println(node.getValue());
        }
    }
}
