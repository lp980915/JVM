//引用计数法（不常用）
public class GC1 {
    //这个成员属性唯一的作用就是占用一代你内存
    private byte[] bigSize=new byte[2*1024*1024];
    Object instance=null;
    public static void main(String[] args) {

        //无法解决循环引用问题
        GC1 Object1=new GC1();
        GC1 Object2=new GC1();
        Object1.instance=Object2;
        Object2.instance=Object1;
        Object1=null;
        Object2=null;

        //手动唤醒gc(并非立即开启，等待调度后执行)
        System.gc();
    }
}
