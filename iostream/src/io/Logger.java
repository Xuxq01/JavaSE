package io;
/*
日志文件
 */
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    public static void log(String msg){
        try {
            PrintStream out = new PrintStream(new FileOutputStream("log.txt",true));
            System.setOut(out);
            Date nowTime = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
            String strTime = sdf.format(nowTime);

            System.out.println(strTime + ": " + msg);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
