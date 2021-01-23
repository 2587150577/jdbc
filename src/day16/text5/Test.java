package day16.text5;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test {
    public static void main(String[] args) throws Exception{
//        将d盘下的xxx.jar(200M左右)文件复制到e盘下
//        1 利用输入输出流完成文件的复制
//        2 利用缓冲输入输出流完成文件的复制
//        3 对比速度
            a();
            b();
    }

    public static void a() throws Exception{
        long start = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("d:\\HBuilderXl.zip");
        FileOutputStream fos = new FileOutputStream("d:\\HBuilderXl4.zip");
        int len;
        byte[] b = new byte[1024];
        while ((len=fis.read(b))!=-1){
            fos.write(b,0,len);
        }
        fos.flush();
        fos.close();
        fis.close();
        long end = System.currentTimeMillis();

        System.out.println("运行时间为："+(start-end));

    }
    public static void b() throws Exception{
        long start = System.currentTimeMillis();

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("d:\\HBuilderXl.zip"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("d:\\HBuilderXl3.zip"));

        int len;
        byte[] bytes = new byte[1024];
        while ((len = bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }
        bos.flush();
        bos.close();
        bis.close();
        long end = System.currentTimeMillis();

        System.out.println("运行时间为："+(start-end));

    }
}
