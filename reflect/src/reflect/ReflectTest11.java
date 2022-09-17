package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

/*
反编译一个类的Constructor构造方法
 */
public class ReflectTest11 {
    public static void main(String[] args) throws Exception{
        StringBuilder sb = new StringBuilder();
        Class vipClass = Class.forName("bean.Vip");
        sb.append(Modifier.toString(vipClass.getModifiers()));
        sb.append(" class ");
        sb.append(vipClass.getSimpleName());
        sb.append("{\n");

        //拼接构造方法
        Constructor[] constructors = vipClass.getDeclaredConstructors();
        for(Constructor constructor : constructors){
            sb.append("\t");
            sb.append(Modifier.toString(vipClass.getModifiers()));
            sb.append(" ");
            sb.append(vipClass.getSimpleName());
            sb.append("(");
            Class[] parameterTypes = constructor.getParameterTypes();
            for(Class parameterType : parameterTypes){
                sb.append(parameterType.getSimpleName());
                sb.append(",");
            }
            if(parameterTypes.length > 0){
                sb.deleteCharAt(sb.length() - 1);
            }
            sb.append("){}\n");
        }

        sb.append("}");
        System.out.println(sb);
    }
}
