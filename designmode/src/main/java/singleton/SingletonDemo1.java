package singleton;

/**
 * @class name singleton.SingletonDemo1
 * @Description 单例模式饿汉式
 * 类加载到内存后，就实例化一个对象，JVM保证线程安全（每个类只会加载一次）
 * 缺点：无论使不使用的到这个实例，类加载的时候就已经实例化
 * @Author GreyGao
 * @Date 2021/7/3 20:06
 * @Version 1.0
 **/
public class SingletonDemo1 {


    /**
     * 第一步：私有化构造方法
     */
    private SingletonDemo1(){

    }

    /**
     * 初始化实例对象
     */
    private static final SingletonDemo1 st = new SingletonDemo1();


    /**
     * 第三步：提供公共的静态方法获取SingletonDemo1类的实例对象
     * @return SingeltonDemo1
     */
    public static SingletonDemo1 getInstance(){
        return st;
    }

}


class DemoTest1{

    public static void main(String[] args) {
        SingletonDemo1 st = SingletonDemo1.getInstance();
        System.out.println(st);
    }

}
