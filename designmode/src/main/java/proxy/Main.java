package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @class name Main
 * @Description TO DO
 * @Author GreyGao
 * @Date 2021/7/8 21:49
 * @Version 1.0
 **/
public class Main {


    public static void main(String[] args) {
        Car car = new Car();
//        CarProxy carProxy = new CarProxy(car);
//        carProxy.move();

        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        Movable movable = (Movable) Proxy.newProxyInstance(Car.class.getClassLoader(), new Class[]{Movable.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("开始记录日志");
                Object o = method.invoke(car, args);
                System.out.println("结束记录日志");
                return o;
            }
        });

        movable.move();

    }
}
