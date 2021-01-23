package day16;

import java.io.File;

public class Factorial {
    public static void main(String[] args) {
//        System.out.println(jieCheng(5));
        File file = new File("D:\\a");
//        File file = new File("D:\\jdbc");
        fileJC(file);

    }
    public static  int jieCheng(int i) {
        if (i <= 1) {
            return 1;
        }
        return i * jieCheng(--i);
    }

    public static void fileJC(File file){
        File[] files = file.listFiles();
        for (File f : files){
            if (f.isFile()){
                if (f.getName().endsWith(".java")){
                    System.out.println("文件名："+f.getName());
                }
            }else {
                System.out.println("文件夹名："+f.getName());
                fileJC(f);
            }
        }
    }
}
