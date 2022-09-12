package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
使用FileReader和FileWriter进行拷贝,只能拷贝普通文本文件
 */
public class Copy02 {
    public static void main(String[] args) {
        FileReader in = null;
        FileWriter out = null;
        try {
            //读
            in = new FileReader("iostream/src/io/Copy02.java");
            //写
            out = new FileWriter("Copy02.java");
            //一边读一边写
            char[] chars = new char[1024 * 512];//1M
            int readCount = 0;
            while ((readCount = in.read(chars)) != -1) {
                out.write(chars,0,readCount);
            }

            out.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
