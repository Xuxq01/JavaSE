package review;

import java.util.Iterator;
import java.util.LinkedList;

/*
    1.1每个集合元素的创建(new)
    1.2向集合中添加元素
    1.3从集合中取出某个元素
    1.4遍历集合
 */
public class ArrayListTest {
    public static void main(String[] args) {
        //ArrayList<String> list = new ArrayList<>();
        LinkedList<String> list = new LinkedList<>();

        list.add("zhangsan");
        list.add("lisi");
        list.add("wangwu");

        System.out.println(list.get(0));

        for (int i = 0; i < list.size(); i++) {
            String elt = list.get(i);
            System.out.println(elt);
        }

        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        for(Iterator<String> it2 = list.iterator(); it.hasNext();){
            System.out.println(it.next());
        }

        for(String s:list){
            System.out.println(s);
        }
    }
}
