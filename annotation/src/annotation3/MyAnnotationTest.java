package annotation3;
/*
如果属性名为value(),属性名可以不写
只有一个属性并且名为value才可省
 */
public class MyAnnotationTest {
    @MyAnnotation(value = "hehe")
    public void doSome(){

    }

    @MyAnnotation("haha")
    public void doOther(){

    }
}
