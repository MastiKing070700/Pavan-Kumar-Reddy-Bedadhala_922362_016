package com.designpattern.Publisher;
import java.util.ArrayList;

import java.util.List;

import com.designpattern.Interfaces.Observer;
import com.designpattern.Interfaces.Subject;
import com.designpattern.beans.Message;

public class MessagePublisher implements Subject {

	private List<Observer> observers = new ArrayList<>();

	@Override

	public void attach(Observer o) {

		observers.add(o);

	}

	@Override

	public void detach(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyUpdate(Message m) {
		for (Observer o : observers) {
			o.update(m);
		}
	}
}