package annotation;

//@Override只能注解方法
//@Override这个注解是给编译器参考的,与运行阶段无关
//凡是java中的方法带有这个注解的,编译器都会进行编译检查,如果不是重写父类方法,编译器报错
public class AnnotationTest02 {

    @Override
    public String toString() {
        return "toString";
    }
}
