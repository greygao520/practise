package singleton;

/**
 * @class name singleton.SingletonDemo2
 * @Description 单例模式懒汉式
 * @Author GreyGao
 * @Date 2021/7/3 20:11
 * @Version 1.0
 **/
public class SingletonDemo2 {

    private static SingletonDemo2 st2 = null;

    /**
     * 1、私有化构造方法
     */
    private SingletonDemo2(){

    }

    /**
     * 2、提供公共的静态的方法获取实例
     * @return
     */
    public static SingletonDemo2 getInstance(){
        if(st2 == null){
            st2 = new SingletonDemo2();
        }
        return st2;
    }

}

class DemoTest2{

    public static void main(String[] args) {

        Thread one = new Thread(new MyTask());
        Thread two = new Thread(new MyTask());
        one.start();
        two.start();

    }

}


class MyTask implements Runnable{
    @Override
    public void run() {
        for (int i = 0;i < 5;i++){
            SingletonDemo2 st2 = SingletonDemo2.getInstance();
            System.out.println(st2);
        }
    }
}