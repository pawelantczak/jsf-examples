package org.antczak.view;

import java.io.Serializable;
import java.util.List;

import org.antczak.model.User;
import org.antczak.model.UserBean;


public class IndexBean implements Serializable {

	private static final long serialVersionUID = -4901741514584007341L;
	
	private UserBean userBean;
	private List<User> users;
	
	public IndexBean() {
		userBean = new UserBean();
		users = userBean.getUsersList();
	}

	public List<User> getUsers() {
		return users;
	}
}
