package io;

import java.io.BufferedReader;
import java.io.FileReader;

/*
BufferedReader:
    带有缓冲区的字符输入流
    使用这个流的时候不需要自定义char,byte数组,自带缓冲
 */
public class BufferedReaderTest01 {
    public static void main(String[] args) throws Exception {
        FileReader reader = new FileReader("file");
        //当一个流的构造方法中需要一个流的时候,这个被传进来的流叫做:节点流
        //外部负责包装的流叫做:包装流,或者处理流
        //当前程序的FileReader是节点流,BufferedReader是包装流
        BufferedReader br = new BufferedReader(reader);

        /*String firstLine = br.readLine();
        System.out.println(firstLine);

        String secondLine = br.readLine();
        System.out.println(secondLine);*/

        String s = null;
        while((s = br.readLine()) != null){
            System.out.println(s);
        }

        br.close();
    }
}
