package reflect;

import java.lang.reflect.Constructor;

public class ReflectTest12 {
    public static void main(String[] args) throws Exception{
        Class c = Class.forName("bean.Vip");
        //调用无参构造
        Object obj = c.newInstance();
        //调用有参构造
        //第一步:获取到这个有参构造
        Constructor con = c.getDeclaredConstructor(int.class, String.class, String.class, boolean.class);
        //第二步,调用构造方法new对象
        Object newObj = con.newInstance(110, "jackson", "1990-10-11", true);
        System.out.println(newObj);

        Constructor cons = c.getDeclaredConstructor();
        Object newObj2 = cons.newInstance();
        System.out.println(newObj2);
    }
}
