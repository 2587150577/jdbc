package day16.text4;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws Exception{
//        1. 在项目根目录下新建一个文件：data.txt，键盘录入3个字符串验证码，并存入data.txt中，要求一个验证码占 一行；
//        2. 键盘录入一个需要被校验的验证码，如果输入的验证码在data.txt中存在：在控制台提示验证成功，如果不存 在控制台提示验证失败
//        File file = new File("D:\\data.txt");
//        file.createNewFile();
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\data.txt"));
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("请存入:");
        String c = scanner.next();
        String c2 = scanner.next();
        String c3 = scanner.next();
        list.add(c);
        list.add(c2);
        list.add(c3);
        for (String s :list){
            bw.write(s);
        }
        bw.flush();
        BufferedReader bf = new BufferedReader(new FileReader("D:\\data.txt"));
        String len = null;
        ArrayList<String> list1 = new ArrayList<>();
        while ((len=bf.readLine())!= null){
            list1.add(len);
        }

        System.out.println("请输入：");
        String s = scanner.next();

        if (list.contains(s)){
            System.out.println("验证成功");
        }else {
            System.out.println("验证失败");
        }

        bw.close();
        bf.close();
    }
}
