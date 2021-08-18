package com.designpattern.Mediator;
import java.util.ArrayList;
import java.util.List;

import com.designpattern.Interfaces.ChatMediator;
import com.designpattern.Interfaces.User;

public class chatMediator implements ChatMediator {

	private List<User> users = new ArrayList<User>();

	@Override
	public void AddUser(User user) {
		users.add(user);
	}

	@Override
	public void sendMessage(String name, String msg, User user) {
		for (User u : users) {
			u.ReceiveMessage(msg);
			System.out.println("Hi " + name);
		}
	}

}
