
public class MyObject {
    public static void main(String[] args) {
        Object object=new Object();
        //使用getClass进行反射（正常是使用class常见实例，而用实例去寻找class就被称为反射）
        //Object类为启动类加载器，只要是jdk自带的类都为启动类加载器所加载（bootstrap加载器/根加载器），bootstrap类加载器是用c++写的，所以查出来为null
        System.out.println(object.getClass().getClassLoader());
        //bootstrap类加载器为最高层，无parent
        //System.out.println(object.getClass().getClassLoader().getParent().getParent());

        System.out.println("---------------------------------");

        MyObject myObject = new MyObject();
        //我们自己写的类都是使用的应用程序类加载器（AppClassLoader），加载器为AppClassLoader，是用java写的，可以打印出来
        //sun.misc.Launcher为jvm相关调用的入口程序
        System.out.println(myObject.getClass().getClassLoader());
        System.out.println(myObject.getClass().getClassLoader().getParent());
        System.out.println(myObject.getClass().getClassLoader().getParent().getParent());

        //java后续的拓展jar包，都是使用扩展类加载器（Extension加载器）进行加载的，一般都是javax.XX.XX类似的类库
    }
}
