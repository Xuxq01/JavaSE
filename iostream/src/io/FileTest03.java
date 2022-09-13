package io;

import java.io.File;

/*
File中的ListFile方法
 */
public class FileTest03 {
    public static void main(String[] args) {
        //File[] listFiles()
        //获取当前目录下的所有子文件
        File f = new File("D:/Git");
        File[] files = f.listFiles();
        for(File file:files) {
            System.out.println(file.getAbsolutePath());
        }
    }
}
