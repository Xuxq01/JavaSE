package reflect;

public class ReflectTest02 {
    public static void main(String[] args) {
        //通过反射机制获取Class,通过Class实例化对象
        try {
            Class c = Class.forName("bean.User");
            //newInstance()会调用User这个类的无参构造方法,完成对象的创建
            //必须保证无参构造存在
            Object obj = c.newInstance();
            System.out.println(obj);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
