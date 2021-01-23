package day16;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test5 {
    public static void main(String[] args) throws  Exception{
        InputStreamReader isr = new InputStreamReader(new FileInputStream("d:\\a\\a.txt"),"gbk");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("d:\\a\\b.txt"));
        int len;
        char[] c = new char[5];
        while ((len=isr.read(c))!=-1){
            osw.write(c,0,len);
        }
        osw.flush();
        osw.close();
        isr.close();
    }
}
