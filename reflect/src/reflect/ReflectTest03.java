package reflect;

import java.io.FileReader;
import java.util.Properties;

/*
验证反射机制的灵活性
    //java代码写一遍,在不改变java源代码的基础之上,可以做到不同对象的实例化,很灵活
 */
public class ReflectTest03 {
    public static void main(String[] args) throws Exception{
        //通过IO流读取classinfo.properties文件
        FileReader reader = new FileReader("reflect/classinfo.properties");
        //创建属性类对象
        Properties pro = new Properties();
        pro.load(reader);
        reader.close();

        String className = pro.getProperty("className");
        System.out.println(className);

        Class c = Class.forName(className);
        Object obj = c.newInstance();
        System.out.println(obj);
    }
}
