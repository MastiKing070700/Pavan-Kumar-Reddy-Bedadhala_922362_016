package com.designpattern.Client;
import com.designpattern.Interfaces.INotificationObserver;
import com.designpattern.Interfaces.INotificationService;
import com.designpattern.Observer.JohnObserver;
import com.designpattern.Observer.SteveObserver;
import com.designpattern.Service.NotificationService;

public class Client {
	
	public static void main(String[] args) {
		INotificationObserver steve=new SteveObserver();
		INotificationObserver john=new JohnObserver();
		INotificationService service=new NotificationService();
		service.addSubscriber(steve);
		service.addSubscriber(john);
		service.notifySubscriber();
		service.removeSubscriber(john);
		service.notifySubscriber();
	}
}
