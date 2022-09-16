package reflect;

import java.util.ResourceBundle;

/*
java.util包下提供了一个资源绑定器,便于获取属性配置文件中的内容
使用这种方法时,properties必须放到类路径下
 */
public class ResourceBundleTest {
    public static void main(String[] args) {
        //只能绑定xxx.properties文件,扩展名不能写
        ResourceBundle bundle = ResourceBundle.getBundle("classinfo2");

        String className = bundle.getString("className");
        System.out.println(className);
    }
}
