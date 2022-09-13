package io;

import java.io.FileReader;
import java.util.Properties;

/*
IO+Properties的联合应用
 */
public class IOPropertiesTest01 {
    public static void main(String[] args) throws Exception {
        /*
        Properties是一个Map集合,key和value都是String类型
        想将userinfo文件中的数据加载到Properties对象当中
         */
        //新建一个输入流对象
        FileReader reader = new FileReader("iostream/userinfo.properties");

        //新建一个Map集合
        Properties pro = new Properties();

        //调用Properties对象的load方法,将文件中的数据加载到Map集合中
        pro.load(reader);//文件中的数据顺着管道加载到Map集合中,其中等号左边做key,右边做value

        //通过key获取value
        String username = pro.getProperty("username");
        System.out.println(username);

        String password = pro.getProperty("password");
        System.out.println(password);
    }
}
