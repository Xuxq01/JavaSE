package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
1.文件字节输入流,万能的,任何类型的文件都可以采用这个流来读
2.字节的方式,完成输入的操作,完成读的操作(硬盘->内存)
 */
public class FileInputStreamTest01 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        //创建文件字节输入流对象
        //文件路径"C:\Users\11240\IdeaProjects\basic-code\temp",其中"\\"可以改成"/"
        try {
            fis = new FileInputStream("C:\\Users\\11240\\IdeaProjects\\basic-code\\temp");

            int readData = fis.read();//返回值是读取到的"字节"本身
            System.out.println(readData);

            readData = fis.read();
            System.out.println(readData);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //在finally语句块当中确保流一定关闭
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
