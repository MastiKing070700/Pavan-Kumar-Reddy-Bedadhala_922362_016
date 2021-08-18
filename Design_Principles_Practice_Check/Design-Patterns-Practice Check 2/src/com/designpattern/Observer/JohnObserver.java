package com.designpattern.Observer;
import com.designpattern.Interfaces.INotificationObserver;

public class JohnObserver implements INotificationObserver{

	private String name="John";
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void OnServerDown() {
		System.out.println("Server Down message received by "+name);
	}
}
