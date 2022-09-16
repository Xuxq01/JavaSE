package reflect;

/*
路径问题
 */
public class AboutPath {
    public static void main(String[] args) {
        //移植性差,idea的默认路径是project的根
        //离开了idea,换到其他位置,可能路径不是project的根,当前路径就无效了
        //src下的都是类路径下,src是类的根路径
        //FileReader reader = new FileReader("reflect/classinfo.properties");

        //Thread.currentThread() 当前线程对象
        //getContextClassLoader() 线程对象方法, 可以获取到当前线程的类加载器对象
        //getResource() 类加载器对象的方法,当前线程的类加载器默认从类的根路径下加载资源
        String path = Thread.currentThread().getContextClassLoader().getResource("classinfo2.properties").getPath();
        //可以拿到一个文件的绝对路径
    }
}
