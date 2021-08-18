package com.designpattern.Users;
import com.designpattern.Interfaces.ChatMediator;
import com.designpattern.Interfaces.User;
import com.designpattern.Mediator.chatMediator;

public class PremiumUser implements User{

	private ChatMediator chatMediator;
	private String name;
	
	public PremiumUser(String name, ChatMediator mediator) {
		this.name=name;
		this.chatMediator=mediator;
	}
	
	@Override
	public void ReceiveMessage(String msg) {
		System.out.println(this.name+" received messege: "+msg);
	}

	@Override
	public void SendMessage(String name, String msg) {
		System.out.println(name+ " sending messege: "+msg);
		chatMediator.sendMessage(name,msg,this);
	}

}
