package singleton;

/**
 * @class name SingeltonDemo3
 * @Description 单例模式 懒汉式 线程安全
 * @Author GreyGao
 * @Date 2021/7/3 21:13
 * @Version 1.0
 **/
public class SingletonDemo3 {

    /**
     * 增加volatile关键字的原因时，JVM对于热点代码会进行JIT即时编译，代码指令的顺序会重新排列
     */
    private static volatile SingletonDemo3 ST3 = null;

    /**
     * 1、私有化构造方法
     */
    private  SingletonDemo3(){

    }

    public static SingletonDemo3 getInstance(){
        if (ST3 == null){
            synchronized (SingletonDemo3.class){
                if (ST3 == null){
                    ST3 = new SingletonDemo3();
                }
            }
        }
        return ST3;
    }



}


class DemoTest3{

    public static void main(String[] args) throws InterruptedException {

        Thread one = new Thread(new MyTask3());
        Thread two = new Thread(new MyTask3());
        one.start();
        two.start();
    }

}


class MyTask3 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            SingletonDemo3 st3 = SingletonDemo3.getInstance();
            System.out.println(st3);
        }
    }
}