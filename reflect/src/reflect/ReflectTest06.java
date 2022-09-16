package reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/*
通过反射机制,反编译一个类的属性Field
 */
public class ReflectTest06 {
    public static void main(String[] args) throws Exception{
        StringBuilder sb = new StringBuilder();

        Class studentClass = Class.forName("java.util.Date");

        sb.append(Modifier.toString(studentClass.getModifiers()) + " class " + studentClass.getSimpleName() + " {\n");

        Field[] fields = studentClass.getDeclaredFields();
        for(Field field : fields){
            sb.append("\t");
            sb.append(Modifier.toString(field.getModifiers()));
            sb.append(" ");
            sb.append(field.getType().getSimpleName());
            sb.append(" ");
            sb.append(field.getName());
            sb.append(";\n");
        }

        sb.append("}");
        System.out.println(sb);
    }
}
