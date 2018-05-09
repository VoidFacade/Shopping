package shopping.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import shopping.entity.User;
import shopping.service.UserService;
@Controller
public class UserController {
	
	@Autowired
	private UserService userSerive; 
	
	@RequestMapping(method = RequestMethod.GET, value = "/login")
	public String login(@RequestParam(required = false) String error) {
			return "login";
	}
	
	
	@RequestMapping(method = RequestMethod.GET, value = "/reg")
	public String reg(@ModelAttribute User user){
		return "reg";
		
	}
	@RequestMapping(method = RequestMethod.POST, value = "/reg/new")
	public String reg(@Valid @ModelAttribute User user, BindingResult bindingResult,
			 RedirectAttributes redirectAttributes){
		System.out.println(user);
		userSerive.reg(user);
		return "login";
		
	}



}
