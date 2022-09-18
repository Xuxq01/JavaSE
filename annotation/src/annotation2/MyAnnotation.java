package annotation2;

public @interface MyAnnotation {
    /*
    我们在注解当中可以定义属性,以下是MyAnnotation的name属性
    看着像方法,实际为属性
    @return
     */
    String name();

    String color();

    int age() default 25;
}
