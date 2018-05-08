package shopping.service.impl;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import shopping.service.UserService;
@Service
public class UserServiceImpl implements UserDetailsService, UserService {

	public UserDetails loadUserByUsername(String arg0) throws UsernameNotFoundException {
		return null;
	}

}
