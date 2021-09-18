package proxy.v1;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @class name TimeProxy
 * @Description TO DO
 * @Author GreyGao
 * @Date 2021/7/9 22:41
 * @Version 1.0
 **/
public class TimeProxy {

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public void before (){
        System.out.println( sdf.format(new Date(System.currentTimeMillis())));
    }


    public void after (){
        System.out.println( sdf.format(new Date(System.currentTimeMillis())));
    }
}
