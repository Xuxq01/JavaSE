package reflect;

import service.UserService;

import java.lang.reflect.Method;

/*
通过反射机制怎么调用一个对象的方法
    要素1:对象userService
    要素2:logIn方法名
    要素3:实参列表
    要素4:返回值
 */
public class ReflectTest10 {
    public static void main(String[] args) throws Exception{
        //不使用反射机制
        UserService userService = new UserService();
        boolean loginSuccess = userService.logIn("admin", "123");
        System.out.println(loginSuccess);

        //使用
        Class userServiceClass = Class.forName("service.UserService");
        Object obj = userServiceClass.newInstance();

        Method loginMethod = userServiceClass.getDeclaredMethod("logIn", String.class, String.class);
        Object retValue = loginMethod.invoke(obj, "admin", "123");
        System.out.println(retValue);
    }
}
