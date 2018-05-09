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
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import shopping.dao.UserDao;
import shopping.entity.User;
import shopping.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserDetailsService, UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		System.out.println(username);
		User user = userDao.findOneByUsername(username);
		System.out.println(user);
		if (user == null) {
			throw new UsernameNotFoundException(username);
		}
		// 模拟从数据库查到的权限列表
		UserDetailsImpl userDetailsImpl = new UserDetailsImpl(user);
		System.out.println("loadUserByUsername: " + userDetailsImpl);
		return userDetailsImpl;
	}

	@Override
	public void reg(User user) {
		userDao.reg(user);
	}

	@Override
	public User findOne(String username) {
		return userDao.findOneByUsername(username);
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
