package shopping.entity;

public class UserDetalis {
	
 
	private Long id ;
	private String name;
	private String sheng;
	private String shi;
	private String qu;
	private int sex;
	private String email;
	private String idcard;
	private String details;
	
	
	public UserDetalis() {
	}


	public UserDetalis(Long id, String name, String sheng, String shi, String qu, int sex, String email,
			String idcard, String details) {
		super();
		this.id = id;
		this.name = name;
		this.sheng = sheng;
		this.shi = shi;
		this.qu = qu;
		this.sex = sex;
		this.email = email;
		this.idcard = idcard;
		this.details = details;
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


	public String getSheng() {
		return sheng;
	}


	public void setSheng(String sheng) {
		this.sheng = sheng;
	}


	public String getShi() {
		return shi;
	}


	public void setShi(String shi) {
		this.shi = shi;
	}


	public String getQu() {
		return qu;
	}


	public void setQu(String qu) {
		this.qu = qu;
	}


	public int getSex() {
		return sex;
	}


	public void setSex(int sex) {
		this.sex = sex;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getIdcard() {
		return idcard;
	}


	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}


	public String getDetails() {
		return details;
	}


	public void setDetails(String details) {
		this.details = details;
	}


	@Override
	public String toString() {
		return "UserDetalis [id=" + id + ", name=" + name + ", sheng=" + sheng + ", shi=" + shi + ", qu=" + qu
				+ ", sex=" + sex + ", email=" + email + ", idcard=" + idcard + ", details=" + details + "]";
	}


	
	
	
	
	
	
}
