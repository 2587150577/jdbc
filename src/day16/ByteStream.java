package day16;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteStream {
    public static void main(String[] args) throws  Exception{
//        FileOutputStream fos = new FileOutputStream("d:\\b\\b.txt",true);
//        byte[] b = "shijienihao".getBytes();
//        fos.write("world".getBytes());
//        fos.write("\r\n".getBytes());
//        fos.write(b,0,2);
//        fos.close();

        FileInputStream fis = new FileInputStream("d:\\b\\b.txt");
//        System.out.println((char)fis.read());
//        System.out.println((char)fis.read());
//        System.out.println((char)fis.read());
//        System.out.println((char)fis.read());
//        System.out.println((char)fis.read());
//        int b;
//        while ((b=fis.read()) != -1){
//            System.out.println((char)b);
//        }

        int len;
        byte[] b = new byte[2];

        while ((len = fis.read(b))!=-1){

            System.out.println(new String(b,0,len));
        }
        fis.close();
    }

}
