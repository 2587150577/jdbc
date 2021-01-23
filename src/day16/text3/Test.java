package day16.text3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Test {
    //    在d盘下有一个文本文件test.txt(里面的内容由数字和字母组成)
//    定义一个方法统计test.txt文件中指定字符出现的次数。 比如a字符在文件中出现了10次则调用方法传入a后，方法内部输出：a出现10次
    public static void main(String[] args) throws Exception{
        BufferedReader bd = new BufferedReader(new FileReader("D:\\text3.txt"));
        HashMap<Character,Integer> map = new HashMap<>();
        int a;
        ArrayList<Character> list = new ArrayList();
        while (true){
            a = bd.read();
           if (a==-1){
               break;
           }
            list.add((char)a);
        }

        list.stream().forEach(n->{
           if (!map.containsKey(n)){
               map.put(n,1);
           }else {
               int count = map.get(n);
               map.put(n,++count);
           }
        });
        System.out.println(map);
    }


}
