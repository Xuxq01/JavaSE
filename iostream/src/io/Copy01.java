package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
使用FileInputStream + FileOutputStream完成文件的拷贝
一边读一边写
使用字节流拷贝文件的时候,文件类型随意,万能的
 */
public class Copy01 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            //创建一个输入流对象
            fis = new FileInputStream("C:\\Users\\11240\\Desktop\\JavaProjects\\JavaWeb\\开始.txt");
            //创建一个输出流对象
            fos = new FileOutputStream("D:\\开始.txt");

            //一边读一边写
            byte[] bytes = new byte[1024 * 1024];//1M
            int readCount = 0;
            while((readCount = fis.read(bytes)) != -1) {
                fos.write(bytes,0,readCount);
            }

            //刷新,输出流最后要刷新
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //分开try catch,否则其中一个异常可能影响另一个关闭
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
