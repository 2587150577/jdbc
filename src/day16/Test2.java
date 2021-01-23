package day16;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("d:\\1.jpg");
            String path = "e:\\"+System.currentTimeMillis()+".jpg";
            fos = new FileOutputStream(path);
            int len;
            byte[] b =new byte[100];
            while ((len = fis.read(b))!=-1){
                new String(b,0,len);


                fos.write(b,0,len);
            }


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fos != null){
                    fos.close();
                }
                if (fis != null){
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
