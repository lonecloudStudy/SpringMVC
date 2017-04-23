package cn.lonecloud.util;

import java.util.UUID;

/**
 * Created by lonecloud on 17/4/20.
 */
public class RandomUtils {

    public static String getUUID(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }
}
