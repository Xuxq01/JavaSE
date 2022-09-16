package reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectTest08 {
    public static void main(String[] args) throws Exception{
        Class userServiceClass = Class.forName("service.UserService");
        Method[] methods = userServiceClass.getDeclaredMethods();
        System.out.println(methods.length);

        for(Method method : methods){
            System.out.println(method.getName());
            System.out.println(method.getReturnType().getSimpleName());
            System.out.println(Modifier.toString(method.getModifiers()));
            Class[] parameterTypes = method.getParameterTypes();
            for(Class parameterType : parameterTypes){
                System.out.println(parameterType.getSimpleName());
            }
        }
    }
}
