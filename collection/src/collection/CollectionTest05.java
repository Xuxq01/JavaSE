package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

/*
测试contains方法
 */
public class CollectionTest05 {
    public static void main(String[] args) {
        Collection c = new ArrayList();

        User u1 = new User("jack");
        User u2 = new User("jack");

        c.add(u1);
        //没有重写equals之前,这个结果是false(Object中的equals是==判断)
        System.out.println(c.contains(u2));


        Collection cc = new ArrayList();
        String s1 = new String("hello");
        cc.add(s1);
        String s2 = new String("hello");
        cc.remove(s2);
        System.out.println(cc.size());//0
    }
}

class User{
    private String name;
    public User(){
    }
    public User(String name){
        this.name = name;
    }

    //重写equals方法
    //将来调用equals方法时,一定是调用重写的equals方法

    //这个equals方法的比较原理:只要姓名一样,就表示同一个用户
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name);
    }
    //总结:放在集合里的元素需要重写equals方法
}
