package day16.text1;

public class Test {
    public static void main(String[] args) {
//        定义一个递归，求1-100的偶数和
        System.out.println(sum(2));
    }
    public static int sum(int i){
        if (i==100){
            return 100;
        }
        return i+sum(i+2);
    }
}
