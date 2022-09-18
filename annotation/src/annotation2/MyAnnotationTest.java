package annotation2;

public class MyAnnotationTest {
    //如果一个注解中有属性,必须给属性赋值
    //指定name属性的值
    @MyAnnotation(name = "zhangsan",color = "红色")
    public void doSome(){

    }
}
