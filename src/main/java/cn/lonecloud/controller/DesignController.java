package cn.lonecloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lonecloud on 17/4/16.
 */
@Controller
public class DesignController {
    
    @RequestMapping("/helloView")
    public String helloView(){
        return "helloView";
    }

    @RequestMapping("/myTest")
    public String myTest(){
        return "list";
    }

}
