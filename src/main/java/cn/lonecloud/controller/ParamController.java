package cn.lonecloud.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import cn.lonecloud.entity.User;

@Controller
@SessionAttributes(types={String.class},value="test")
public class ParamController {
	
	/**
	 * 获取参数
	 * @Description: 
	 * @param username
	 * @return
	 */
	@RequestMapping("/testParam")
	public String testParam(
			@RequestParam(value = "username", defaultValue = "haha", required = true) String username) {
		System.out.println(username);
		return "paramList";
	}
	/**
	 * 获取头
	 * @Description: 
	 * @param accept
	 * @return
	 */
	@RequestMapping("/testHeader")
	public String testHeader(
			@RequestHeader(value="Accept-Language") String accept) {
		System.out.println("Accept-Language:"+accept);
		return "paramList";
	}
	/**
	 * 获取cookies
	 * @Description: 
	 * @param jSessionId
	 * @return
	 */
	@RequestMapping("/testCookies")
	public String testCookies(
			@CookieValue(value="JSESSIONID") String jSessionId) {
		System.out.println("jSessionId:"+jSessionId);
		return "paramList";
	}
	
	@RequestMapping("/testUser")
	public String testUser(User user){
		System.out.println("用户"+user);
		return "user";
	}
	/**
	 * 设置参数ModelAndView
	 * @Description: 
	 * @param user
	 * @return
	 */
	@RequestMapping("/testModel")
	public ModelAndView testModel(User user){
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("user");
		modelAndView.addObject("test", "我是测试信息");
		System.out.println("用户"+user);
		return modelAndView;
	}
	/**
	 * 页面设置参数
	 * @Description: 
	 * @param map
	 * @return
	 */
	@RequestMapping("/testMap")
	public String testMap(Map<String,Object> map){
		map.put("test", Arrays.asList("1","csdcs","jcssd"));
		return "user";
	}
	
}
