package reflect;

import java.lang.reflect.Field;

/*
怎么通过反射机制访问一个java对象的属性
 */
public class ReflectTest07 {
    public static void main(String[] args) throws Exception{
        Class studentClass = Class.forName("bean.Student");
        Object obj = studentClass.newInstance();

        Field noField = studentClass.getDeclaredField("no");
        noField.set(obj,22222);//给obj对象的no属性赋值22222
        //反射机制让代码复杂了,但是灵活
        System.out.println(noField.get(obj));

        //私有属性不可访问,除非打破封装
        Field nameField = studentClass.getDeclaredField("name");
        //打破封装
        nameField.setAccessible(true);
        nameField.set(obj,"jackson");
        System.out.println(nameField.get(obj));
    }
}
