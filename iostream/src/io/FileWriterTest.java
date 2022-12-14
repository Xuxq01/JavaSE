package io;

import java.io.FileWriter;
import java.io.IOException;

/*
FileWriter:
    文件字符输出流,写
    只能输出普通文本
 */
public class FileWriterTest {
    public static void main(String[] args) {
        FileWriter out = null;
        try {
            out = new FileWriter("file");

            char[] chars = {'我','是','中','国','人'};
            out.write(chars);
            out.write(chars,2,3);

            out.write("我是一名java软件工程师");
            out.write("\n");
            out.write("helloworld");

            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
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
