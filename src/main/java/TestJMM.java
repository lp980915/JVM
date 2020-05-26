/**
 * 测试JMMjava内存模型
 * JMM=可见性，通知机制
 */

public class TestJMM {
    public static void main(String[] args) {
        Number number = new Number();
        new Thread(()->{
            //新建线程修改Number类中num属性值
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            number.upNum();
            System.out.println(Thread.currentThread().getName()+"\t 线程，当前的num值为:"+number.num);
        },"AA").start();

        while (number.num==10){
            //当其他线程修改了Number类中的num属性值，main线程是不可见的，在main线程里，num依旧是原来的10
        }
    }
}

class Number{
    //添加volatile关键字，线程变为可见，main线程可以检测到num值的修改，代表当此属性更新后，主内存会对其他线程进行通知
    volatile int num=10;
    //int num=10;
    public void upNum(){
        this.num=10000;
    }
}