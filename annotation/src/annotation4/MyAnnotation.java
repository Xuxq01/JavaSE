package annotation4;

public @interface MyAnnotation {
    /*
    注解中属性的类型
        byte short int long double boolean char String class 枚举类型
        以及以上每一种的数组形式
     */
    int value1();
    String value2();
    int[] value3();
    String[] value4();
    Season value5();
    Season[] value6();
    Class parameterType();
    Class[] parameterTypes();
}
