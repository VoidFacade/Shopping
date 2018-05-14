package shopping.dao;

import java.util.List;

import shopping.entity.Car;
import shopping.entity.Goods;
import shopping.entity.Order;
import shopping.entity.User;
import shopping.entity.UserDetalis;

public interface UserDao {
	User findOneByUsername(String username);

	void reg(User user);

	List<Goods> findAllCommoditys();

	User findUser(Long id);

	shopping.entity.UserDetalis finUserDetalis(Long id);

	void createDatalis(shopping.entity.UserDetalis userDetalis);

	void updateDetalis(UserDetalis userDetalis);

	List<Order> getUserOrder(Long id);

	List<Car> getUserCars(Long id);

	void changeVipPwd(String pwd1,Long id);
}
