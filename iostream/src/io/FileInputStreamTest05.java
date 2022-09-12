package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
其他常用方法
    int available()
    long skip(long n)
 */
public class FileInputStreamTest05 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("iostream/src/io/tempfile");
/*            int readByte = fis.read();
            //还剩下五个字节
            System.out.println("剩下" + fis.available() + "个字节没有读");*/
            //方法的用处
/*            byte[] bytes = new byte[fis.available()];
            //不需要循环,读一次就可以
            int readCount = fis.read(bytes);
            System.out.println(new String(bytes,0,readCount));*/

            //skip跳过几个字节不读取,可能会用
            fis.skip(3);
            System.out.println(fis.read());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
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
