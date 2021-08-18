package com.designpattern.HandlerSubClasses;

import com.designpattern.Handler.ILeaveRequestHandler;

public class ProjectManager extends ILeaveRequestHandler{
	
	public ProjectManager(int days) {
		this.days=days;
	}
}
