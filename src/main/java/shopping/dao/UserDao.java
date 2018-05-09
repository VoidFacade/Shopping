package shopping.dao;

import java.util.List;

import shopping.entity.Commodity;
import shopping.entity.User;

public interface UserDao {
	User findOneByUsername(String username);

	void reg(User user);

	List<Commodity> findAllCommoditys();
}
