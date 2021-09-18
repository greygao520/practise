package strategy;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @class name Test
 * @Description TO DO
 * @Author GreyGao
 * @Date 2021/7/4 19:15
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args) {

        Cat [] arr = new Cat[] {new Cat(3,3),new Cat(9,9),new Cat(1,1)};

        Dog [] arrDog = new Dog[] {new Dog(3,3),new Dog(9,9),new Dog(1,1)};

        System.out.println(Arrays.toString(arr));
        Cat[] res = (Cat[])Sorter.sort(arr, new CatComparator());
        System.out.println(Arrays.toString(res));


        System.out.println(Arrays.toString(arrDog));
        Dog[] res2 = (Dog[])Sorter.sort(arrDog, (Object o1,Object o2)->{
            Dog dog1 = (Dog) o1;
            Dog dog2 = (Dog) o2;
            if(dog1.foodAmount > dog2.foodAmount){
                return 1;
            }else if(dog1.foodAmount < dog2.foodAmount){
                return -1;
            }else{
                return 0;
            }
        });
        System.out.println(Arrays.toString(res2));

    }

}
