package strategy;

/**
 * @class name Sorter
 * @Description TO DO
 * @Author GreyGao
 * @Date 2021/7/4 19:21
 * @Version 1.0
 **/
public class Sorter {


    public static  Object [] sort(Object[] arr, Comparator comparator) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (comparator.compare(arr[i], arr[j]) == 1){
                    Object temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }


    
    
    
    
    

}
