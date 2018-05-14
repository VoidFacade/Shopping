package shopping.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import shopping.dao.UserDao;
import shopping.dao.impl.mapping.UserMapping;
import shopping.entity.Car;
import shopping.entity.Goods;
import shopping.entity.Order;
import shopping.entity.User;
import shopping.entity.UserDetalis;
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
	public List<Goods> findAllCommoditys() {
		return userMapping.findAllCommoditys();
	}

	@Override
	public User findUser(Long id) {
		return userMapping.findUser(id);
	}

	@Override
	public UserDetalis finUserDetalis(Long id) {
		return userMapping.findUserDetails(id);
	}

	@Override
	public void createDatalis(UserDetalis userDetalis) {
		userMapping.createDatalis(userDetalis);
	}

	@Override
	public void updateDetalis(UserDetalis userDetalis) {
		userMapping.updateDetalis(userDetalis);
	}

	@Override
	public List<Order> getUserOrder(Long id) {
		return userMapping.getUserOrder(id);
	}

	@Override
	public List<Car> getUserCars(Long id) {
		return userMapping.getUserCars(id);
	}

}
