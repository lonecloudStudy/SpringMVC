package cn.lonecloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import cn.lonecloud.entity.User;
/**
 * @SessionAttribute 中标明了一个名字为user 对象
 * @Title: ErrorController.java
 * @Package cn.lonecloud.controller
 * @Description: 
 * @author lonecloud
 * @date 2017年4月12日 下午8:01:56
 */
@SessionAttributes(value="user",types=String.class)
@Controller
public class ErrorController {

	@RequestMapping("/testError")
	public String testError(@ModelAttribute("user")User user){
		System.out.println("user"+user);
		return "testError";
	}
}
