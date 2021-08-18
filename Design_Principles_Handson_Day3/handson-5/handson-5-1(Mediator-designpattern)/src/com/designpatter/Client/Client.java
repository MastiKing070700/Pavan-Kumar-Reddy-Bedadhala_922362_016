package com.designpatter.Client;
import com.designpattern.Mediator.chatMediator;
import com.designpattern.Users.BasicUser;
import com.designpattern.Users.PremiumUser;

public class Client {
	
	public static void main(String[] args) {
		chatMediator chatMediator=new chatMediator();
		BasicUser bu=new BasicUser("Pavan", chatMediator);
		PremiumUser pu=new PremiumUser("Himakar", chatMediator);
		PremiumUser pu2=new PremiumUser("Sravan", chatMediator);
		chatMediator.AddUser(bu);
		chatMediator.AddUser(pu);
		chatMediator.AddUser(pu2);
		String name=bu.getName();
		
		bu.SendMessage(name, "Hi Everyone");
	}
}
