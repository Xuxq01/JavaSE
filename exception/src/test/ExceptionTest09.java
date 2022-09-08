package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
异常对象的两个方法:
    String msg = e.getMessage();
    e.printStackTrace();

我们以后查看异常的追踪信息,我们应该怎么看,可以快速地调试程序呢?
    异常信息追踪信息,从上往下一行一行看
    但是需要注意的是:sun写的代码(java包名)不用看了,主要问题出现在自己写的代码上
 */
public class ExceptionTest09 {
    public static void main(String[] args) {
        try {
            m1();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    private static void m1() throws FileNotFoundException {
        m2();
    }

    private static void m2() throws FileNotFoundException {
        m3();
    }

    private static void m3() throws FileNotFoundException {
        new FileInputStream("\"C:\\Users\\11240\\Desktop\\新建 文本文档.py\"");
    }
}
