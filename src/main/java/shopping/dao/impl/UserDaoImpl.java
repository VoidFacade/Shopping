package shopping.dao.impl;

import org.springframework.stereotype.Repository;

import shopping.dao.UserDao;
import shopping.entity.User;
@Repository
public class UserDaoImpl implements UserDao {

	@Override
	public User findOneByUsername(String username) {
		return null;
	}

}
