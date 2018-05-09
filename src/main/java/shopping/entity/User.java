package shopping.entity;

import java.util.List;

public class User {

	private Long id;
	private String username;
	private String email;
	private String phoneNumber;
	private String password;
//	private String verification;
	private List<String> permissions;
	private String role;

	public User() {
	}

	public User(Long id, String username, String email, String phoneNumber, String password,
			List<String> premissions, String role) {
		this.id = id;
		this.username = username;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.password = password;
//		this.verification = verification;
		this.permissions = premissions;
		this.role = role;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}



	public List<String> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<String> permissions) {
		this.permissions = permissions;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", email=" + email + ", phoneNumber=" + phoneNumber
				+ ", password=" + password +  ", premissions=" + permissions
				+ ", role=" + role + "]";
	}

	

}
