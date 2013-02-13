package org.antczak.model;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserBean implements Serializable {

	private static final long serialVersionUID = 8514272896487427409L;
	private List<User> usersList;

	public UserBean() {
		usersList = new ArrayList<User>();
		generateData(15);
	}

	public List<User> getUsersList() {
		return usersList;
	}

	private void generateData(int qty) {
		for (int i = 0; i < qty; i++) {
			
			User user = new User();
			user.setId(i);
			user.setFirstName("First Name " + i);
			user.setLastName("Last Name " + i);
		    DateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");
		    Date date = new Date();
			user.setBirthDate(outputFormat.format(date));
			
			usersList.add(user);
		}
	}

}
