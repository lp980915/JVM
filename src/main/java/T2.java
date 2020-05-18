public class T2 {
    public static void main(String[] args) {
        Thread thread=new Thread();
        thread.start();
        thread.start();

        //Exception in thread "main" java.lang.IllegalThreadStateException
        //不合法的线程状态异常，start方法只能使用一次

        //native代表调用的是与java无关的第三方库或者c语言函数库
        //比如线程就属于系统级的，而不是语言级的，有些东西是java这个语言无法完成的，比如系统的线程，java只是负责去调用
    }
}
