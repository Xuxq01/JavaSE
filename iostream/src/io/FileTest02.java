package io;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTest02 {
    public static void main(String[] args) {
        File f1 = new File("copy");
        //获取文件名
        System.out.println("文件名: " + f1.getName());

        //判断是否是一个目录
        System.out.println(f1.isDirectory());

        //判断是否是一个文件
        System.out.println(f1.isFile());

        //获取文件最后一次修改时间
        long milliSecond = f1.lastModified();//这个返回值毫秒是1970年到现在的总毫秒数
        //将总毫秒数转换为日期
        Date time = new Date(milliSecond);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String strTime = sdf.format(time);
        System.out.println(strTime);

        //获取文件大小
        System.out.println(f1.length());//46字节
    }
}
