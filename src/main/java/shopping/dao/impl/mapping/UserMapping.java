package shopping.dao.impl.mapping;

import java.util.List;

import shopping.entity.Commodity;
import shopping.entity.User;

public interface UserMapping {
	List<Commodity> findAllCommoditys();

	User findOneByUsername(String username);

	void reg(User user);
}
