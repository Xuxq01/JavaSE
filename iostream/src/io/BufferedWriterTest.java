package io;

import java.io.*;

public class BufferedWriterTest {
    public static void main(String[] args) throws Exception{
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("copy",true)));
        out.write("hello world");
        out.write("\n");
        out.write("hello kitty");
        out.flush();
        out.close();
    }
}
