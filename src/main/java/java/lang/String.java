package java.lang;

public class String {

    /**
     * 双亲委派机制，为了防止用户自己写的代码污染jdk中的源代码而出现的一种保护机制
     * jdk的rt.jar中已经包含了java.lang.String这个类
     * 在加载所有类的时候，都按照相同的顺序进行加载：首先是Bootstrap加载器进行加载，如果没有加载到，则抛给Extension加载器，如果还是没有加载到，最后抛给App加载器
     * 如果有相同的两个类需要加载，则会优先使用辈分更高的加载进行加载
     * 所以此处的java.lang.String并不会被加载，才会报错，因为根本没有被加载，Bootstrap类加载器已经加载了jdk中自带的java.lang.String类
     * @param args
     */
    //在类 java.lang.String 中找不到 main 方法
    public static void main(String[] args) {
        System.out.println("-------------AAA");
    }
}
