package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest03 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("iostream/src/io/tempfile");

            //开始读,采用byte数组,一次读取多个字节,最多读取数组.length个字节
            byte[] bytes = new byte[4];//准备一个4个长度的byte数组,一次最多读取4个字节
            //返回值是读取到的字节数量,不是字节本身
            int readCount = fis.read(bytes);
            System.out.println(readCount);//第一次读到了四个字节
            //System.out.println(new String(bytes));//abcd
            //不应该全转换,应该读取多少转换多少
            System.out.println(new String(bytes,0,readCount));

            readCount = fis.read(bytes);
            System.out.println(readCount);
            //System.out.println(new String(bytes));//efcd
            System.out.println(new String(bytes,0,readCount));

            readCount = fis.read(bytes);
            System.out.println(readCount);//一个字节都没读到返回-1
            //System.out.println(new String(bytes));//efcd

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
