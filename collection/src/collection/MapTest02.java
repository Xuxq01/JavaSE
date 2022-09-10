package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
Map集合的遍历
 */
public class MapTest02 {
    public static void main(String[] args) {
        //第一种方式:
        //1.获取所有的key,通过遍历key来遍历value
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"张三");
        map.put(2,"李四");
        map.put(3,"王五");
        map.put(4,"赵六");
        //2.遍历Map集合
        //获取所有的key,是一个Set集合
        Set<Integer> keys = map.keySet();
        //遍历key
        //迭代器,foreach
        Iterator<Integer> it = keys.iterator();
        while (it.hasNext()){
            Integer key = it.next();
            String value = map.get(key);
            System.out.println(key + "=" + value);
        }
        System.out.println("============================");
        for(Integer key:keys){
            System.out.println(key + "=" + map.get(key));
        }

        //第二种方式:Set<Map,Entry<K,V>> entrySet()
        //将Map集合直接全部转换为Set集合
        //Set集合中元素的类型是:Map.Entry
        Set<Map.Entry<Integer, String>> set = map.entrySet();
        //遍历Set集合,每次取出一个Node
        Iterator<Map.Entry<Integer,String>> it2 = set.iterator();
        while (it.hasNext()){
            Map.Entry<Integer, String> node = it2.next();
            Integer key = node.getKey();
            String value = node.getValue();
            System.out.println(key + "=" + value);
        }
        System.out.println("============================");

        for (Map.Entry<Integer, String> node : set) {
            System.out.println(node.getKey() + "=" + node.getValue());
        }
    }
}
