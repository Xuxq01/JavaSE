package annotation4;

public class OtherAnnotationTest {
    @OtherAnnotation(age = 25,email = {"zhangsan@123.com","lisi@souhu.com"},seasonArray = Season.WINTER)
    public void doSome(){

    }

    //如果数组中只有一个元素,大括号可以省略
    @OtherAnnotation(age = 25,email = "zhangsan@123.com",seasonArray = {Season.SPRING,Season.SUMMER})
    public void doOther(){

    }
}
