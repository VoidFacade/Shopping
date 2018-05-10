package shopping.dao;

import java.util.List;

import shopping.entity.Commodity;
import shopping.entity.User;
import shopping.entity.UserDetalis;

public interface UserDao {
	User findOneByUsername(String username);

	void reg(User user);

	List<Commodity> findAllCommoditys();

	User findUser(Long id);

	shopping.entity.UserDetalis finUserDetalis(Long id);

	void createDatalis(shopping.entity.UserDetalis userDetalis);

	void updateDetalis(UserDetalis userDetalis);
}
