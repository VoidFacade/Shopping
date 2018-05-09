package shopping.entity;

import java.util.List;

public class Car {
	
	private Long id;
	private List<Commodity> commoditys;

	public Car() {
	}

	public Car(Long id,List<Commodity> commoditys) {
		this.id = id;
		this.commoditys = commoditys;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Commodity> getCommoditys() {
		return commoditys;
	}

	public void setCommoditys(List<Commodity> commoditys) {
		this.commoditys = commoditys;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", commoditys=" + commoditys + "]";
	}

	
}
