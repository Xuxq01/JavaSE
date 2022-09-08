package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
关于try...catch中的finally子句:
    1.在finally子句中的代码是最后执行的,并且一定会执行的,即使try语句块中的代码出现了异常
      finally子句必须和try一起出现,不能单独编写
    2.finally语句通常使用在哪些情况下呢?

 */
public class ExceptionTest10 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
             fis = new FileInputStream("C:\\Users\\11240\\Desktop\\新建 文本文档.py");
            //....
            String s = null;
            //这里一定会出现空指针异常
            s.toString();
            //流使用完需要关闭,因为占用资源
            //即使以上程序出现异常,流也必须关闭
            //放在这里有可能流关不了
            //fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
           e.printStackTrace();
        } catch (NullPointerException e){
            e.printStackTrace();
        } finally {
            //流的关闭放在这里比较安全
            //finally一定执行即使try出现异常
            if(fis != null){
                try {
                    //close()方法有异常,采用捕捉的方式
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
