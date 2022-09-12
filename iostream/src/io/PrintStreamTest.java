package io;

import java.io.FileOutputStream;
import java.io.PrintStream;

/*
java.io.PrintStream:标准的字节输出流,默认输出到控制台
 */
public class PrintStreamTest {
    public static void main(String[] args) throws Exception{
        //联合起来写
        System.out.println("hello world");

        //分开写
        PrintStream ps = System.out;
        ps.println("hello zhangsan");
        ps.println("hello lisi");

        //标准输出流不需要手动close()关闭
        //可以改变标准输出流的输出方向
        //标准输出流不再指向控制台,指向log文件
        System.setOut(new PrintStream(new FileOutputStream("log")));
        //修改输出方向,将输出方向修改到log文件
        System.out.println("hello world");
    }
}
