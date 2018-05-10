package shopping.dao.impl.mapping;

import java.util.List;

import shopping.entity.Commodity;
import shopping.entity.User;
import shopping.entity.UserDetalis;

public interface UserMapping {
	List<Commodity> findAllCommoditys();

	User findOneByUsername(String username);

	void reg(User user);

	User findUser(Long id);

	UserDetalis findUserDetails(Long id);

	void createDatalis(UserDetalis userDetalis);

	void updateDetalis(UserDetalis userDetalis);
}
