import java.util.Random;

//测试OOM（OutOfMemoryError）内存溢出(测试的为堆内存溢出)
public class TestOOM {
    public static void main(String[] args) {
        //java.lang.OutOfMemoryError:Java heap space,属于Error错误，不属于异常

        String str="ljc,hello";
        while (true){
            str+=str+new Random().nextInt(88888888)+new Random().nextInt(99999999);
        }

        //java.lang.OutOfMemoryError:Java heap space,属于Error错误，不属于异常

        //new了一个40MB大小的字节数组，堆内存溢出
       /* byte[] bytes=new byte[40*1024*1024];*/
    }
}
