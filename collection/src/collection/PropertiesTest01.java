package collection;

import java.util.Properties;

/*
Properties类相关方法
Properties是一个Map集合,继承Hashtable,它的key和value都是String类型
被称为属性类对象,是线程安全的
 */
public class PropertiesTest01 {
    public static void main(String[] args) {
        //创建Properties对象
        Properties pro = new Properties();
        //两个方法,一个存一个取
        pro.setProperty("url","jdbc:mysql://localhost:3306/bjpowernode");
        pro.setProperty("driver","com.mysql.jdbc.Driver");
        pro.setProperty("username","root");
        pro.setProperty("password","123");

        //通过key获取value
        String url = pro.getProperty("url");
        String driver = pro.getProperty("driver");
        String username = pro.getProperty("username");
        String password = pro.getProperty("password");

        System.out.println(url);
        System.out.println(driver);
        System.out.println(username);
        System.out.println(password);
    }
}
