package shopping.dao;

import shopping.entity.User;

public interface UserDao {
	User findOneByUsername(String username);
}
