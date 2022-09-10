package bean;
/*
HashMap集合允许key为null,但是只能有一个
 */
import java.util.HashMap;
import java.util.Map;

public class HashMapTest03 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(null,null);
        System.out.println(map.size());

        map.put(null,100);
        System.out.println(map.size());//key重复的话value覆盖

        System.out.println(map.get(null));
    }
}
