package com.designpattern.Interfaces;

public interface ChatMediator {
	
	public void AddUser(User user);
	public void sendMessage(String name, String msg, User user);
}
