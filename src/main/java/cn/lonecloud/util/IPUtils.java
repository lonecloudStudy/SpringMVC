package cn.lonecloud.util;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by lonecloud on 17/4/20.
 */
public class IPUtils {

    public static String getIPAddr(HttpServletRequest request){
        String ip = null;
        if (request.getHeader("x-forwarded-for") == null) {
            return request.getRemoteAddr();
        }
        return request.getHeader("x-forwarded-for");
    }
}
