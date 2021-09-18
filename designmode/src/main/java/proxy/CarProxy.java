package proxy;

/**
 * @class name CarProxy
 * @Description TO DO
 * @Author GreyGao
 * @Date 2021/7/8 21:50
 * @Version 1.0
 **/
public class CarProxy implements Movable {

    Car car;

    public CarProxy(Car car){
        this.car = car;
    }

    @Override
    public void move() {
        System.out.println("开始记录日志！！");
        car.move();

        System.out.println("记录结束的日志！！");
    }
}
