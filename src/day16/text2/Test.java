package day16.text2;

import java.io.File;
import java.util.*;

public class Test {
    //    键盘录入一个文件夹路径,统计该文件夹(包含子文件夹)中每种类型的文件及个数 注意:用文件类型(后缀名,不包含.(点),如："java","txt")作为key,
//    用个数作为value,放入到map集合中,并用两种方式遍历map集合（iterator和entry）
//    例如：
//    doc 的类型的文件有 3 个
//    java 的类型的文件有 5 个
//    txt 的类型的文件有 7 个
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入路径:");
        String path = scanner.next();
        File file = new File(path);
        HashMap<String, Integer> map = biLi(file);

//        Set<String> strings = map.keySet();
//        Iterator<String> it = strings.iterator();
//        while (it.hasNext()) {
//            String s = it.next();
//            System.out.println(s+"的类型的文件有" + map.get(s) + "个");
//        }
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry :entries){
            System.out.println(entry.getKey()+"的类型的文件有" + entry.getValue() + "个");
        }

    }
    static  int javas =0;
    static  int doc = 0;
    static int txt = 0;

    public static HashMap<String, Integer>  biLi(File file) {
        File[] files = file.listFiles();
        HashMap<String, Integer> map = new HashMap<>();
        for (File f : files) {
            if (f.isFile()) {
                if (f.getName().endsWith(".java")) {
                    javas++;
                } else if (f.getName().endsWith(".txt")) {
                    txt++;
                } else if (f.getName().endsWith(".doc")) {
                    doc++;
                }
            } else {
                biLi(f);
            }
        }
        map.put("java", javas);
        map.put("txt", txt);
        map.put("doc", doc);
        return map;
        }


    }

