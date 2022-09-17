package reflect;
/*
给一个类,获取它的父类,以及实现的接口
 */
public class ReflectTest13 {
    public static void main(String[] args) throws Exception{
        Class stringClass = Class.forName("java.lang.String");

        //获取String的父类
        Class superClass = stringClass.getSuperclass();
        System.out.println(superClass.getName());

        //获取所有接口
        Class[] interfaces = stringClass.getInterfaces();
        for(Class in : interfaces){
            System.out.println(in.getName());
        }
    }
}
