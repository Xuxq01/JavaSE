package io;
/*
这个文件不是普通文档,记事本打不开
 */
import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataOutputStreamTest {
    public static void main(String[] args) throws Exception{
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("data"));

        byte b = 100;
        short s = 200;
        int i = 300;
        long l = 400L;
        float f = 3.0f;
        double d = 3.14;
        boolean sex = false;
        char c = 'a';

        dos.writeByte(b);//把数据以及类型一并写入到文件当中
        dos.writeShort(s);
        dos.writeInt(i);
        dos.writeLong(l);
        dos.writeFloat(f);
        dos.writeDouble(d);
        dos.writeBoolean(sex);
        dos.writeChar(c);

        dos.flush();
        dos.close();
    }
}
