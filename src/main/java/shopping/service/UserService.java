package shopping.service;

import java.util.List;

import shopping.entity.Address;
import shopping.entity.Car;
import shopping.entity.Goods;
import shopping.entity.Order;
import shopping.entity.OrderDetalis;
import shopping.entity.User;
import shopping.entity.UserDetalis;

public interface UserService {

	void reg(User user);

	User findUser(Long id);

	User usernameExist(String username);

	List<Goods> findAllCommoditys();

	User findOne(String username);

	UserDetalis findUserDetalis(Long id);

	void createDetalis(UserDetalis userDetalis);

	void updateDetalis(UserDetalis userDetalis);

	List<Order> getUserOrder(Long id);

	List<Car> getUserCars(Long id);

	void changeVipPwd(String pwd1, Long long1);

	List<Address> getUserAddress(Long id);

	OrderDetalis getOrderDetalis(Long orderId);

}
