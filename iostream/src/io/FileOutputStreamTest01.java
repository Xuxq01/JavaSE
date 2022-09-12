package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest01 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            //myfile不存在时会自动新建
            //这种方式会将原文件清空,然后重新写入
            //fos = new FileOutputStream("myfile");

            //以追加的方式在文件末尾写入,不会清空文件内容
            fos = new FileOutputStream("iostream/src/io/tempfile",true);
            //开始写
            byte[] bytes = {97,98,99,100};
            fos.write(bytes);
            //将bytes数组的一部分写出
            fos.write(bytes,0,2);//再写出ab

            String s = "我是一个中国人,我骄傲!";
            byte[] bs = s.getBytes();
            fos.write(bs);
            //写完之后,最后一定要刷新
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
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
