package shopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import shopping.service.UserService;
@Controller
public class UserController {
	
	private UserService userSerive; 
	
	@RequestMapping(method = RequestMethod.GET, value = "/login")
	public String login(@RequestParam(required = false) String error) {
			return "login";
		
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/login")
	public String loginIndex(@RequestParam(required = false) String error) {
		
		if (error != null) {
			return "login";
		}else{
			return "index";
		}
		
	}
	@RequestMapping(method = RequestMethod.GET, value = "/reg")
	public String reg(){
		
		return "reg";
		
	}
	@RequestMapping(method = RequestMethod.POST, value = "/reggys")
	public String reggys(){
		
		
		return "login";
		
	}



}
