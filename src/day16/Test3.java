package day16;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test3 {
    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;
        try {
             fr = new FileReader("e:\\软件\\Navicat Premium 12 破解补丁\\繁体中文64位\\version.dll");
             fw = new FileWriter("d:\\version.dll");

             int len;
            char[] chars = new char[1024];
                while ((len = fr.read(chars)) != -1){
//                    System.out.println(new String(chars));

                    fw.write(chars,0,len);
                    fw.flush();

                }
        } catch (IOException e) {


        } finally {
            try {
                if (fw != null){
                    fw.close();
                }
                if (fr != null){
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
