package shopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class UserController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/login")
	public String login(@RequestParam(required = false) String error) {
			return "login";
		
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/login")
	public String loginIndex(@RequestParam(required = false) String error) {
		if (error != null) {
			System.out.println("登录失败");
		}
			return "login";
		
	}



}
