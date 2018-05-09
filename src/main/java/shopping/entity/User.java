package shopping.entity;

public class User {

	private Long id;
	private String email;
	private String username;
	private String phonenumber;
	private String password;
	public User() {
	}
	public User(Long id, String email, String username, String phonenumber, String password) {
		this.id = id;
		this.email = email;
		this.username = username;
		this.phonenumber = phonenumber;
		this.password = password;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", username=" + username + ", phonenumber=" + phonenumber
				+ ", password=" + password + "]";
	}
	

}
