package com.designpattern.HandlerSubClasses;

import com.designpattern.Handler.ILeaveRequestHandler;

public class Supervisor extends ILeaveRequestHandler{

	public Supervisor(int days) {
		this.days=days;
	}
}
