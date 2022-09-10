package bean;

import java.util.Hashtable;
import java.util.Map;
/*
Hashtable的key和value都不能为空
    初始化容量11,默认加载因子0.75
    扩容:原容量*2+1
 */
public class HashTableTest01 {
    public static void main(String[] args) {
        Map map = new Hashtable();
        map.put(null,"123");
        map.put(100,null);
    }
}
