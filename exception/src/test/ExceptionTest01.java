package test;

public class ExceptionTest01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c = a / b;
        //实际上JVM在执行到此处的时候,会new异常对象: new ArithmeticException("/ by zero");
        //并且JVM将new的异常对象输出,打印输出到控制台
        System.out.println(a + "/" + b + "=" + c);

    }
}
