package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/*
java.util.Map接口中常用的方法:
    1.Map和Collection没有继承关系
    2.Map集合以key和value的方式存储数据:键值对
        key和value都是引用数据类型
        key和value都是存储对象的内存地址
        key起到主导的地位,value是key的附属品
    3.Map接口中常用方法:
        V put(K key, V value) 向Map集合中添加键值对
        V get(Object key) 通过key获取value
        void clear() 清空Map集合
        boolean containsKey(Object key) 判断Map中是否包含某个key
        boolean containsValue(Object value) 判断Map中是否包含某个value
        boolean isEmpty() 判断Map集合中元素的个数是否为0
        Set<K> keySet() 获取Mao集合中所有key(所有的键是一个Set集合)
        V remove(Object key) 通过key删除键值对
        int size() 获取Mao集合中键值对的个数
        Collection<V> values() 获取Map集合中所有的value,返回一个Collection
        Set<Map.Entry<K,V>> entrySet() 将Map集合转换成Set集合
 */
public class MapTest01 {
    public static void main(String[] args) {
        //创建Map集合对象
        Map<Integer,String> map = new HashMap<>();
        //向Map集合中添加键值对
        map.put(1,"张三");//1在这里进行了自动装箱
        map.put(2,"李四");
        map.put(3,"王五");
        map.put(4,"赵六");
        //通过key获取value
        String value = map.get(2);
        System.out.println(value);

        System.out.println(map.size());//获取键值对的数量

        map.remove(2);
        System.out.println(map.size());
        //contains放大底层调用的都是equals方法进行比较的,所以自定义的类型需要重写equals方法
        System.out.println(map.containsKey(4));

        System.out.println(map.containsValue("王五"));

        Collection<String> values = map.values();
        for(String s: values){
            System.out.println(s);
        }

        map.clear();
        System.out.println(map.size());

        System.out.println(map.isEmpty());
    }
}
