package shopping.service;

import java.util.List;

import shopping.entity.Commodity;
import shopping.entity.User;

public interface UserService {

	void reg(User user);

	User findOne(String username);

	User usernameExist(String username);

	List<Commodity> findAllCommoditys();


}
