package shopping.dao.impl.mapping;

import shopping.entity.User;

public interface UserMapping {
	User findOneByUsername(String username);
}
