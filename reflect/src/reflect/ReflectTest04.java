package reflect;
/*
研究Class.forName()发生了什么
 */
public class ReflectTest04 {
    public static void main(String[] args) {
        try {
            //forName导致类加载,静态代码块随着类加载而执行
            Class.forName("reflect.MyClass");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class MyClass{
    static {
        System.out.println("MyClass类的静态代码块执行了");
    }
}