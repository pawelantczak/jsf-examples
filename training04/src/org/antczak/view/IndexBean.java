package org.antczak.view;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import org.antczak.datamodel.User;
import org.antczak.model.UserBean;

@ManagedBean
@RequestScoped
public class IndexBean implements Serializable {

	private static final long serialVersionUID = 1072491834157241508L;
	
	@ManagedProperty("#{userBean}")
	private UserBean userBean;
	private List<User> users;
	
	private int userId;
	private String userFirstName;
	private String userLastName;
	private Date userBirthDate;
	private String message = "";
	
	
	public void addUser() {
		if (userBean.addUser(userId, userFirstName, userLastName, userBirthDate)) {
			userFirstName = "";
			userLastName = "";
			userBirthDate = null;
			userId = 0;
			message = "Success: user added.";
		} else message = "Error: duplicated id.";
	}
	public void removeUser(User user) {
		userBean.removeUser(user);
	}
	
	// getters & setters
	
	public void setUserBean(UserBean userBean) {
		this.userBean = userBean;
	}
	public UserBean getUserBean() {
		return userBean;
	}
	
	public List<User> getUsers() {
		return userBean.getUsersList();
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public Date getUserBirthDate() {
		return userBirthDate;
	}

	public void setUserBirthDate(Date userBirthDate) {
		this.userBirthDate = userBirthDate;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
