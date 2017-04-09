package cn.lonecloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 * 对RestFul的支持
 * @Title: RestController.java
 * @Package cn.lonecloud.controller
 * @Description: 
 * @author lonecloud
 * @date 2017年4月9日 上午10:47:47
 */
@RequestMapping("/rest")
@Controller
public class RestController{

	@RequestMapping(value="/testRest/{id}",method=RequestMethod.DELETE)
	public String RestDelete(@PathVariable("id")String id){
		System.out.println("delete"+id);
		return "list";
	}
	@RequestMapping(value="/testRest/{id}",method=RequestMethod.GET)
	public String RestGET(@PathVariable("id")String id){
		System.out.println("get"+id);
		return "list";
	}
	@RequestMapping(value="/testRest/{id}",method=RequestMethod.PUT)
	public String RestPUT(@PathVariable("id")String id){
		System.out.println("put"+id);
		return "list";
	}
	@RequestMapping(value="/testRest/{id}",method=RequestMethod.POST)
	public String RestPOST(@PathVariable("id")String id){
		System.out.println("post"+id);
		return "list";
	}
	@RequestMapping(value="/testRest/",method=RequestMethod.GET)
	public String RestPOST(){
		return "list";
	}
}
