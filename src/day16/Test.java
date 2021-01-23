package day16;

import java.io.File;

public class Test {
    public static void main(String[] args) throws Exception{
        File file = new File("D://a//a.txt");

//        file.delete();
//        file.mkdirs();
//        System.out.println(file.delete());
//        file.createNewFile();
        System.out.println(file.createNewFile());

    }
}
