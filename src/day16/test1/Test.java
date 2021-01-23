package day16.test1;

import java.io.*;

public class Test {
    public static void main(String[] args) {
//        a();
        b();
    }
    public static  void  a(){
        User user = new User(1,"admin",20);
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("d:\\user.txt"));
            oos.writeObject(user);
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (oos != null){
                    oos.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public static void b(){
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("d:\\user.txt"));

            User s =null;
            s = (User) ois.readObject();
            System.out.println("id:"+s.getId()+",name:"+s.getName()+",age:"+s.getAge());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (ois != null){
                    ois.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
