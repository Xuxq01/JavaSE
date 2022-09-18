package annotation7;

import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args) throws Exception{
        Class userClass = Class.forName("annotation7.User");
        if(userClass.isAnnotationPresent(Id.class)){
            Field[] fields = userClass.getDeclaredFields();
            boolean isRight = false;
            for(Field field : fields){
                if("id".equals(field.getName()) && "int".equals(field.getType().getSimpleName())){
                    isRight = true;
                    break;
                }
            }

            if(!isRight){
                throw new HasNotIdPropertyException("被@Id注解标注的类中必须要有一个int类型的id属性");
            }
        }
    }
}
