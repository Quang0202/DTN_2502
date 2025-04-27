package com.vti.entity;

public class Admin extends User {

	private int expInYear;

	public Admin(int id, String fullName, String email, int expInYear) {
		super(id, fullName, email, Role.ADMIN);
		this.expInYear = expInYear;
	}
	
	public Admin(int id, String fullName, String email) {
		super(id, fullName, email, Role.ADMIN);
	}

	public int getExpInYear() {
		return expInYear;
	}

	public void setExpInYear(int expInYear) {
		this.expInYear = expInYear;
	}

	@Override
	public String toString() {
		return "Admin [expInYear=" + expInYear + ", id=" + id + ", fullName=" + fullName + ", email=" + email
				+ ", role=" + role + "]";
	}

}
