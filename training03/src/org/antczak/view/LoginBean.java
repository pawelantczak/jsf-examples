package org.antczak.view;

import java.io.Serializable;

import javax.faces.component.html.HtmlCommandButton;
import javax.faces.component.html.HtmlSelectBooleanCheckbox;
import javax.faces.event.ValueChangeEvent;

public class LoginBean implements Serializable {

	private static final long serialVersionUID = 5437286235144473951L;
	private String userName;
	private String userPass;
	private HtmlSelectBooleanCheckbox acceptCheckbox;
	private HtmlCommandButton loginButton;

	public String checkUser() {
		if (this.userName.equals(this.userPass)) {
			return "success";
		}
		return "failure";
	}

	public void activateButton(ValueChangeEvent e) {
		if (acceptCheckbox.isSelected()) {
			loginButton.setDisabled(false);
		} else {
			loginButton.setDisabled(true);
		}
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	public HtmlSelectBooleanCheckbox getAcceptCheckbox() {
		return acceptCheckbox;
	}

	public void setAcceptCheckbox(HtmlSelectBooleanCheckbox acceptCheckbox) {
		this.acceptCheckbox = acceptCheckbox;
	}

	public HtmlCommandButton getLoginButton() {
		return loginButton;
	}

	public void setLoginButton(HtmlCommandButton loginButton) {
		this.loginButton = loginButton;
	}
}
