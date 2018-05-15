package shopping.dao.impl.mapping;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import shopping.entity.Address;
import shopping.entity.Car;
import shopping.entity.Goods;
import shopping.entity.Order;
import shopping.entity.OrderDetalis;
import shopping.entity.User;
import shopping.entity.UserDetalis;

public interface UserMapping {
	List<Goods> findAllCommoditys();

	User findOneByUsername(String username);

	void reg(User user);

	User findUser(Long id);

	UserDetalis findUserDetails(Long id);

	void createDatalis(UserDetalis userDetalis);

	void updateDetalis(UserDetalis userDetalis);

	List<Order> getUserOrder(Long id);

	List<Car> getUserCars(Long id);

	void changeVipPwd(@Param("pwd1") String pwd1,@Param("id") Long id);

	List<Address> getUserAddress(Long id);

	OrderDetalis getOrderDetalis(@Param("orderId") Long orderId);
}
