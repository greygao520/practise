package strategy;

/**
 * @class name Dog
 * @Description TO DO
 * @Author GreyGao
 * @Date 2021/7/4 19:15
 * @Version 1.0
 **/
public class Dog {

    int foodAmount;
    int weight;


    public Dog(int foodAmount, int weight){
        this.foodAmount = foodAmount;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "foodAmount=" + foodAmount +
                ", weight=" + weight +
                '}';
    }
}
