package shopping.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import shopping.entity.Commodity;
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
	@RequestMapping(method = RequestMethod.GET, value = "/index")
	public String index() {
		return "index";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/")
	public String goIndex() {
		return "redirect:/prolist";
	}
	
	
	@RequestMapping(method = RequestMethod.GET, value = "/reg")
	public String reg(@ModelAttribute User user){
		return "reg";
		
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/reg")
	public String reg(@Valid @ModelAttribute User user, BindingResult bindingResult,
			 RedirectAttributes redirectAttributes) throws Exception{
		User user1 = userSerive.usernameExist(user.getUsername());
		if(user1 != null){
			System.out.println("用户名已存在");
		}else{
			userSerive.reg(user);
		}
		return "redirect:/login";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/prolist")
	public String getProlist(Model model){
		List<Commodity> commoditys = userSerive.findAllCommoditys();
		model.addAttribute("commoditys",commoditys);
		return "prolist";
		
	}

	

}
