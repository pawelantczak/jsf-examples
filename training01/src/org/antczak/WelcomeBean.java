package org.antczak;

import java.io.Serializable;


public class WelcomeBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 428058258075551885L;
	private String firstName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

}
