package shopping.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import shopping.entity.Address;
import shopping.entity.Car;
import shopping.entity.Goods;
import shopping.entity.Order;
import shopping.entity.User;
import shopping.entity.UserDetalis;
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
		List<Goods> goods = userSerive.findAllCommoditys();
		model.addAttribute("goods",goods);
		return "prolist";
		
	}
	@RequestMapping(method = RequestMethod.GET, value = "/vip/{id}")
	public String getVip(@AuthenticationPrincipal(expression = "user") User curUser, Model model){
		User user = userSerive.findUser(curUser.getId());
		model.addAttribute("user", user);
		return"vip";
	}
	@RequestMapping(method = RequestMethod.POST, value = "/vip/{id}")
	public String editVip(@ModelAttribute UserDetalis userDetalis,@PathVariable Long id ){
		UserDetalis userD = userSerive.findUserDetalis(id);
		if(userD == null){
			
			userDetalis.setId(id);
			userSerive.createDetalis(userDetalis);
		}else{
			userDetalis.setId(id);
			System.out.println(userDetalis);
			userSerive.updateDetalis(userDetalis);
		}
		
		return "redirect:/vip/{id}";
		
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/vipOrder/{id}")
	public String getVipOrder(@AuthenticationPrincipal(expression = "user") User curUser, Model model){
		System.out.println(curUser.getId());
		List<Order> orders = userSerive.getUserOrder(curUser.getId());
		model.addAttribute("orders", orders);
		return "vipOrder";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/vipShoucang/{id}")
	public String getVipShoucang(@AuthenticationPrincipal(expression = "user") User curUser, Model model){
		System.out.println(curUser.getId());
		List<Car> cars = userSerive.getUserCars(curUser.getId());
		model.addAttribute("cars", cars);
		return "vipShoucang";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/vipPwd/{id}")
	public String getVipPwd(@AuthenticationPrincipal(expression = "user") User curUser, Model model){
		System.out.println(curUser.getId());
		return "vipPwd";
	}
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/vipPwd/{id}")
	public String changeVipPwd(@AuthenticationPrincipal(expression = "user") User curUser,
			@RequestParam String pwd1,@RequestParam String pwd2){
		if(pwd1.equals(pwd2)){
			System.out.println("修改密码");
			userSerive.changeVipPwd(pwd1,curUser.getId());
			return "redirect:/vip/{id}";
		}else{
			System.out.println("密码不匹配");
			return "vipPwd";
		}
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/vipAddress/{id}")
	public String getVipAddress(@AuthenticationPrincipal(expression = "user") User curUser, Model model){
		System.out.println(curUser.getId()+"address");
		List<Address> adds = userSerive.getUserAddress(curUser.getId());
		model.addAttribute("adds", adds);
		return "vipAddress";
	}
	
	
	

}
