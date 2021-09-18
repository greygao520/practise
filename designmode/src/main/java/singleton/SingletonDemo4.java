package singleton;

/**
 * @class name singleton.SingletonDemo4
 * @Description 静态内部类的写法
 * 实现了懒加载，一个类的内部类在这个加载时，内部类不会被加载
 * 保证了线程安全，JVM保证每个类只会被加载一次
 * @Date 2021/7/4 16:26
 * @Version 1.0
 **/
public class SingletonDemo4 {


    private SingletonDemo4(){

    }


    private static class SubSingletonDemo4{
        private static final SingletonDemo4 ST4 = new SingletonDemo4();
    }

    public static SingletonDemo4 getInstance(){
        return SubSingletonDemo4.ST4;
    }


    public static void main(String[] args) {
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                SingletonDemo4 instance = SingletonDemo4.getInstance();
                System.out.println(instance.hashCode());
            }
        }).start();
    }

}
