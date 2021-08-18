package com.designpattern.HandlerSubClasses;

import com.designpattern.Handler.ILeaveRequestHandler;

public class HR extends ILeaveRequestHandler{
	public HR(int days) {
		this.days=days;
	}
}
