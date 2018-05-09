package shopping.entity;
//商品类
public class Commodity {
	
	private Long id;
	private String name;
	private String details;
	private int conunt;
	public Commodity() {
	}
	public Commodity(Long id, String name, String details, int conunt) {
		this.id = id;
		this.name = name;
		this.details = details;
		this.conunt = conunt;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public int getConunt() {
		return conunt;
	}
	public void setConunt(int conunt) {
		this.conunt = conunt;
	}
	@Override
	public String toString() {
		return "Commodity [id=" + id + ", name=" + name + ", details=" + details + ", conunt=" + conunt + "]";
	}
	
	
}
