package reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/*
反射Student类中所有的Field
 */
public class ReflectTest05 {
    public static void main(String[] args) throws Exception{
        //获取整个类
        Class studentClass = Class.forName("bean.Student");
        //获取类中所有的public修饰的Field
        Field[] fields = studentClass.getFields();
        System.out.println(fields.length);//1
        //取出这个Field
        Field f = fields[0];
        String fieldName = f.getName();
        System.out.println(fieldName);

        //获取所有的Field
        Field[] fs = studentClass.getDeclaredFields();
        System.out.println(fs.length);

        System.out.println("==========================");

        for(Field field : fs){
            //获取属性的修饰符列表
            int i = field.getModifiers();//返回的修饰符是一个数字,每个数字是修饰符的代号
            System.out.println(i);
            String modifierString = Modifier.toString(i);
            System.out.println(modifierString);
            //将代号数字转为字符串
            //获取属性的类型
            Class fieldType = field.getType();
            //String fName = fieldType.getName();
            String fName = fieldType.getSimpleName();
            System.out.println(fName);
            //获取属性的名字
            System.out.println(field.getName());
        }
    }
}
