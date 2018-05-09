package shopping.service;

import shopping.entity.User;

public interface UserService {

	void reg(User user);

	User findOne(String username);


}
