package io;

import java.io.*;

/*
拷贝目录
 */
public class CopyDirector {
    public static void main(String[] args) {
        File srcFile = new File("D:\\steam");

        File destFile = new File("C:\\");

        copyDir(srcFile,destFile);
    }

    private static void copyDir(File srcFile, File destFile) {
        if(srcFile.isFile()) {
            //srcFile如果是一个文件的话,递归结束
            FileInputStream fis = null;
            FileOutputStream fos = null;
            try {
                fis = new FileInputStream(srcFile);
                String path = (destFile.getAbsolutePath().endsWith("\\") ? destFile.getAbsolutePath() : destFile.getAbsolutePath() + "\\" + srcFile.getAbsolutePath().substring(3));
                fos = new FileOutputStream(path);

                byte[] bytes = new byte[1024 * 1024];
                int readCount = 0;
                while((readCount = fis.read(bytes)) != -1) {
                    fos.write(bytes,0,readCount);
                }


                fos.flush();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (fis != null) {
                    try {
                        fis.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (fos != null) {
                    try {
                        fos.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            return;
        }
        File[] files = srcFile.listFiles();
        for(File file: files) {
            //System.out.println(file.getAbsolutePath());
            if(file.isDirectory()) {
                String srcDir = file.getAbsolutePath();
                String destDir = (destFile.getAbsolutePath().endsWith("\\") ? destFile.getAbsolutePath() : destFile.getAbsolutePath() + "\\") + srcDir.substring(3);
                File newFile = new File(destDir);
                if(!newFile.exists()){
                    newFile.mkdirs();
                }
            }

            copyDir(file,destFile);
        }
    }
}
