package strategy;

/**
 * @class name Cat
 * @Description TO DO
 * @Author GreyGao
 * @Date 2021/7/4 19:14
 * @Version 1.0
 **/
public class Cat {

    int weight;
    int height;

    public Cat(int weight,int height){
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
