package io;

import java.io.File;

/*
File类和四大家族没关系,所以不能完成文件的读和写
 */
public class FileTest01 {
    public static void main(String[] args) throws Exception{
        //创建一个file对象
        File f1 = new File("D:/file");

        //判断是否存在
        System.out.println(f1.exists());

        //如果D:/file不存在,则以文件的形式创建
        /*if(!f1.exists()) {
            f1.createNewFile();
        }*/

        //如果D:/file不存在,则以目录的形式创建
        /*if(!f1.exists()) {
            f1.mkdir();
        }*/

        //创建多重目录
        File f2 = new File("D:/a/b/c/d/e/f");
        /*if(!f2.exists()) {
            //以多重目录方式新建
            f2.mkdirs();
        }*/

        File f3 = new File("D:\\PageFile");
        //获取父路径
        String parentPath = f3.getParent();
        System.out.println(parentPath);
        File parentFile = f3.getParentFile();
        //获取绝对路径
        System.out.println(parentFile.getAbsolutePath());

        File f4 = new File("copy");
        System.out.println("绝对路径" + f4.getAbsolutePath());
    }
}
