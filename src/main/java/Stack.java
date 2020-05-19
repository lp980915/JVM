//StackOverflowError(栈溢出，方法加载过多导致的栈溢出)
//StackOverflowError属于错误，不属于异常
public class Stack {
    public static void main(String[] args) {
        System.out.println("111111111111111111111");
        method1();
        System.out.println("333333333333333333333");
    }

    public static void method1(){
        method1();
    }
}
