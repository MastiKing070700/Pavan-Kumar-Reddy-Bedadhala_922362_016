package com.designpattern.Handler;

import com.designpattern.Beans.LeaveRequest;
import com.designpattern.HandlerSubClasses.HR;
import com.designpattern.HandlerSubClasses.ProjectManager;
import com.designpattern.HandlerSubClasses.Supervisor;

public class Client {

	public static ILeaveRequestHandler doChaining() {
		ILeaveRequestHandler supervisor=new Supervisor(ILeaveRequestHandler.SUPERVISORDAYS);
		
		ILeaveRequestHandler projectManager = new ProjectManager(ILeaveRequestHandler.PROJECTMANAGER);
		supervisor.nextHandler=projectManager;
		
		ILeaveRequestHandler hr=new HR(ILeaveRequestHandler.HRDAYS);
		projectManager.nextHandler=hr;
		
		return supervisor;
		
	}
	
	public static void main(String[] args) {
		ILeaveRequestHandler handler= doChaining();
		LeaveRequest leaveRequest=new LeaveRequest();
		leaveRequest.setName("Mrunal");
		leaveRequest.setDays(2);
		handler.HandleRequest(leaveRequest.getDays(),leaveRequest.getName());
	}

}
