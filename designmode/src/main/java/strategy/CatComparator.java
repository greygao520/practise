package strategy;

/**
 * @class name CatComparator
 * @Description TO DO
 * @Author GreyGao
 * @Date 2021/7/4 19:33
 * @Version 1.0
 **/
public class CatComparator implements Comparator<Cat> {


    @Override
    public int compare(Cat cat1, Cat cat2) {
        if (cat1.weight > cat2.weight){
            return 1;
        }else if(cat1.weight < cat2.weight){
            return -1;
        }else{
            return 0;
        }
    }
}
