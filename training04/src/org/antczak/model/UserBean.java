package org.antczak.model;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.antczak.datamodel.User;

@ManagedBean
@SessionScoped
public class UserBean implements Serializable {

	private static final long serialVersionUID = 8514272896487427409L;
	private List<User> usersList;
	DateFormat outputFormat;
	Date date;

	public UserBean() {
		outputFormat = new SimpleDateFormat("yyyy-MM-dd");
		date = new Date();
		usersList = new ArrayList<User>();
		generateData(5);
	}

	public List<User> getUsersList() {
		return usersList;
	}

	public boolean addUser(int userId, String userFirstName,
			String userLastName, Date userBirthDate) {
		User newUser = new User(userId, userFirstName, userLastName,
				outputFormat.format(userBirthDate));
		for (User existUser : usersList) {
			if (existUser.compareTo(newUser) == 0)
				return false;
		}
		usersList.add(newUser);
		return true;
	}

	public void removeUser(User user) {
		System.out.println("removeUser, id: " + user.getId());
		usersList.remove(user);
		System.out.println("removeUser, count: " + usersList.size());
	}

	private void generateData(int qty) {
		User user;
		for (int i = 0; i < qty; i++) {
			user = new User();
			user.setId(i);
			user.setFirstName("First Name " + i);
			user.setLastName("Last Name " + i);
			user.setBirthDate(outputFormat.format(date));
			usersList.add(user);
		}
	}

}
