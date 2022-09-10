package bean;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
HashMap集合:
    1.HashMap集合底层是哈希/散列表的数据结构
    2.哈希表的数据结构:
        哈希表是一个数组和单向链表的集合体
        数组:在查询方面效率很高,随机增删方面效率较低
        单向链表:在随机增删方面效率较高,查询方效率较低
        哈希表将以上的两种数据结构融合在一起
    3......
    4.主要掌握map.put(k,v),v = map.get(k)这两个方法的实现原理
    5.HashMap集合key部分特点:
        无序,不可重复
        无序:不一定挂到哪个单向链表上
        不可重复:equals方法保证HashMap集合的key不可重复
        如果key重复了,value会被覆盖
    6.哈希表HashMap使用不当无法发挥性能
        假设所有hashCode()方法返回的值为某个固定的值,那么就导致哈希表变成了
        纯单向链表,这种情况成为:散列分布不均匀
        假设将所有hashCode()方法返回值都设为不一样的值,哈希表就变成一维数组了,没有链表的概念了,也是散列表分布不均匀
    散列分布均匀需要重写hashCode()方法时有一定的技巧
    7.重点:放在HashMap集合中的key部分元素,以及放在HashSet集合中的元素,需要同时重写hashCode和equals方法
    8.HashMap集合的默认初始化容量是16,默认加载因子是0.75
    当HashMap集合底层数组容量达到0.75时数组开始扩容
    HashMap集合初始化容量必须是2的倍数,达到散列分布均匀,为了提高HashMap集合的存取效率所必需的
 */
public class HashMapTest01 {
    public static void main(String[] args) {
        //测试HashMap的key部分元素特点
        Map<Integer,String> map = new HashMap<>();
        map.put(1111,"张三");
        map.put(6666,"李四");
        map.put(7777,"王五");
        map.put(2222,"赵六");
        map.put(2222,"KING");

        System.out.println(map.size());

        Set<Map.Entry<Integer, String>> set = map.entrySet();
        for(Map.Entry<Integer,String> entry: set){
            //无序不可重复
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}
