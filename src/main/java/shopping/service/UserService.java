package shopping.service;

import java.util.List;

import shopping.entity.Commodity;
import shopping.entity.User;
import shopping.entity.UserDetalis;

public interface UserService {

	void reg(User user);

	User findUser(Long id);

	User usernameExist(String username);

	List<Commodity> findAllCommoditys();

	User findOne(String username);

	UserDetalis findUserDetalis(Long id);

	void createDetalis(UserDetalis userDetalis);

	void updateDetalis(UserDetalis userDetalis);

}
