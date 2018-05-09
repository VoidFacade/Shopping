package shopping.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import shopping.dao.UserDao;
import shopping.dao.impl.mapping.UserMapping;
import shopping.entity.Commodity;
import shopping.entity.User;
@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	private UserMapping userMapping;

	@Override
	public User findOneByUsername(String username) {
		return userMapping.findOneByUsername(username);
	}

	@Override
	public void reg(User user) {
		userMapping.reg(user);
	}

	@Override
	public List<Commodity> findAllCommoditys() {
		return userMapping.findAllCommoditys();
	}

}
