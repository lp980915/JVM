//配置JVM堆内存
public class Heap {
    public static void main(String[] args) {
        //在idea的导航栏中点击run，选择edit configuration ，设置OM options为设置堆内存大小以及打印GC日志
        //Runtime类代表运行时数据区（每个jvm都会有运行时数据区）
        //获取此电脑逻辑核心数量
        System.out.println(Runtime.getRuntime().availableProcessors());

        //当前机器默认堆内存（物理内存的1/64）
        long totalMemory = Runtime.getRuntime().totalMemory();

        //当前机器默认最大堆内存（物理内存的1/4）
        long maxMemory = Runtime.getRuntime().maxMemory();

        System.out.println("-Xms:默认堆内存:"+totalMemory+"字节="+((double)totalMemory/1024/1024)+"MB");
        System.out.println("-Xmx:默认最大堆内存:"+maxMemory+"字节="+((double)maxMemory/1024/1024)+"MB");
    }
}
