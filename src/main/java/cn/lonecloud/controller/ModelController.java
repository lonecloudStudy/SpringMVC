package cn.lonecloud.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.lonecloud.entity.User;

@Controller
public class ModelController {

	@ModelAttribute
	public void getUser(
			@RequestParam(value = "id", required = false) String id,
			Map<String, Object> map) {
		System.out.println("getUser");
		if (id == null) {
			//模拟查询数据库
			User user = new User("1", "lonecloud", "123456", 13);
			map.put("user", user);
			System.out.println(user);
		}
	}

	@RequestMapping("/changeUser")
	public String changUser(User user) {
		return "user";
	}
}
