package com.designpattern.Subscribers;
import com.designpattern.Interfaces.Observer;
import com.designpattern.beans.Message;

public class MessageSubscriberThree implements Observer

{

	@Override
	public void update(Message m) {
		System.out.println("MessageSubscriberThree :: " + m.getMessageContent());
	}

	

}