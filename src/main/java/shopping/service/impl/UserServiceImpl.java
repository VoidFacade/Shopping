package shopping.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import shopping.dao.UserDao;
import shopping.entity.Address;
import shopping.entity.Car;
import shopping.entity.Goods;
import shopping.entity.Order;
import shopping.entity.OrderDetalis;
import shopping.entity.User;
import shopping.entity.UserDetalis;
import shopping.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserDetailsService, UserService {

	
	private UserDao userDao;
	private BCryptPasswordEncoder passwordEncoder;
	
	
	@Autowired
	public UserServiceImpl(UserDao userDao, BCryptPasswordEncoder passwordEncoder) {
		this.userDao = userDao;
		this.passwordEncoder = passwordEncoder;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userDao.findOneByUsername(username);
		if (user == null) {
			throw new UsernameNotFoundException(username);
		}
		// 模拟从数据库查到的权限列表
		UserDetailsImpl userDetailsImpl = new UserDetailsImpl(user);
		return userDetailsImpl;
	}

	@Override
	public void reg(User user) {
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		userDao.reg(user);
	}

	@Override
	public User findOne(String username) {
		return userDao.findOneByUsername(username);
	}

	@Override
	public User usernameExist(String username) {
		
		return userDao.findOneByUsername(username) ;
	}

	@Override
	public List<Goods> findAllCommoditys() {
		return userDao.findAllCommoditys();
	}

	@Override
	public User findUser(Long id) {
		
		return userDao.findUser(id);
	}

	@Override
	public UserDetalis findUserDetalis(Long id) {
		return userDao.finUserDetalis(id);
	}

	@Override
	public void createDetalis(UserDetalis userDetalis) {
		userDao.createDatalis(userDetalis);
	}

	@Override
	public void updateDetalis(UserDetalis userDetalis) {
		userDao.updateDetalis(userDetalis);
	}

	@Override
	public List<Order> getUserOrder(Long id) {
		return userDao.getUserOrder(id);
	}

	@Override
	public List<Car> getUserCars(Long id) {
		
		return userDao.getUserCars(id);
	}

	@Override
	public void changeVipPwd(String pwd1,Long id) {
		pwd1 = passwordEncoder.encode(pwd1);
		
		userDao.changeVipPwd(pwd1,id);
	}

	@Override
	public List<Address> getUserAddress(Long id) {
		return userDao.getUserAddress(id);
	}

	@Override
	public OrderDetalis getOrderDetalis(Long orderId) {
		return userDao.getOrderDetalis(orderId);
	}

	@Override
	public Goods getGoodsDetalis(String id) {
		return userDao.getGoodsDetalis(id);
	}

	@Override
	public Car getCar(Long id) {
		return userDao.getCar(id);
	}


}

class UserDetailsImpl extends org.springframework.security.core.userdetails.User {
	private User user;

	public UserDetailsImpl(User user) {
		super(user.getUsername(), user.getPassword(), buildAuthorities(user));
		this.user = user;
	}

	private static Collection<? extends GrantedAuthority> buildAuthorities(User user) {
		// spring
		// security把角色权限都抽象成了GrantedAuthority，为了区分，我们使用PERM_前缀表示权限，ROLE_前缀表示角色
		List<GrantedAuthority> authorities = new ArrayList<>();
		return authorities;
	}

	public User getUser() {
		return user;
	}

	@Override
	public String toString() {
		return "UserDetailsImpl [user=" + user + "]\n" + super.toString();
	}

}
