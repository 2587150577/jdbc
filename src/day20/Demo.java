package day20;

import org.junit.*;

public class Demo {


    @Test
    public  void a(){
        System.out.println("hello");
    }
    @Test
    public  void b(){
        System.out.println("word");
    }

    @Before
        public void myBefore(){
        System.out.println("方法前");
    }

    @After
    public void myAfter(){
        System.out.println("方法后");
    }

    @BeforeClass
    public static void myBeforClass(){
        System.out.println("开始");
    }
    @AfterClass
    public static void myAfterClass(){
        System.out.println("结束");
    }
}
