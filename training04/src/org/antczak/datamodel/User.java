package org.antczak.datamodel;

import java.io.Serializable;

public class User implements Comparable<User>, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5319408811791675977L;
	private int id;
	private String firstName;
	private String lastName;
	private String birthDate;
	
	public User(int id, String firstName, String lastName, String birthDate) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
	}

	public User() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public int compareTo(User user) {
		if (this.id == user.id)
			return 0;
		if (this.id > user.id)
			return 1;
		else
			return -1;
	}
}
