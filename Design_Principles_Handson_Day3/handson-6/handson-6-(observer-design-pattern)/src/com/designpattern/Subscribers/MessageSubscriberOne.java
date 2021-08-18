package com.designpattern.Subscribers;
import com.designpattern.Interfaces.Observer;
import com.designpattern.beans.Message;

public class MessageSubscriberOne implements Observer

{

	@Override
	public void update(Message m) {
		System.out.println("MessageSubscriberOne :: " + m.getMessageContent());

	}

}
