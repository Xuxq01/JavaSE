package reflect;

import java.util.Date;

/*
要操作一个类的字节码,要首先获取字节码
    三种方式:

 */
public class ReflectTest01 {
    public static void main(String[] args) {
        /*
        Class.foeName()
            1.静态方法
            2.方法参数是一个字符串
            3.字符串需要一个完整类名
            4.完整类名必须带有包名,java.lang也不能省
         */
        Class c1 = null;
        Class c2 = null;
        try {
            c1 = Class.forName("java.lang.String");
            c2 = Class.forName("java.util.Date");
            Class c3 = Class.forName("java.lang.Integer");
            Class c4 = Class.forName("java.lang.System");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //java中任何一个对象都有一个方法:getClass()
        String s = "abc";
        Class x = s.getClass();//x代表String.class字节码文件,x代表String类型
        System.out.println(c1 == x);

        Date time = new Date();
        Class y = time.getClass();
        System.out.println(c2 == y);

        //第三种方式:java语言中任何一种类型,包括基本数据类型,都有.class属性
        Class z = String.class;//z代表String类型
        Class k = Date.class;//k代表Date类型
        Class f = int.class;//f代表int类型
        Class e = double.class;//e代表double类型

        System.out.println(x == z);
    }
}
