package com.vti.entity;

public class User {

	protected int id;
	protected String fullName;
	protected String email;
	protected String password;
	protected Role role;

	public User(int id, String fullName, String email, Role role) {
		this.id = id;
		this.fullName = fullName;
		this.email = email;
		this.role = role;
	}

	public User(int id, String fullName, String email) {
		this.id = id;
		this.fullName = fullName;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", fullName=" + fullName + ", email=" + email + "]";
	}

}
