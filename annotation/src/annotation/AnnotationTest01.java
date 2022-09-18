package annotation;
/*
注解/注释
注解Annotation是一种引用数据类型,编译之后生成xxx.class文件
自定义注解:
    [修饰符列表] @interface 注解名类型{

    }
 */
@MyAnnotation
public class AnnotationTest01 {
    @MyAnnotation
    private int no;

    @MyAnnotation
    public AnnotationTest01() {
    }

    @MyAnnotation
    public static void m1(){
        @MyAnnotation
        int i = 100;

    }

    @MyAnnotation
    public void m2(@MyAnnotation String name,@MyAnnotation int k){

    }
}

@MyAnnotation
interface MyInterface{

}

@MyAnnotation
enum Season{
    SPRING,SUMMER,AUTUMN,WINTER
}