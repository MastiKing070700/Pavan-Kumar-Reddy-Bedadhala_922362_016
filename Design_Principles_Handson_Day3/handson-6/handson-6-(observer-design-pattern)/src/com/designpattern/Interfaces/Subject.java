package com.designpattern.Interfaces;
import com.designpattern.beans.Message;

public interface Subject

{
	public void attach(Observer o);
	public void detach(Observer o);
	public void notifyUpdate(Message m);
}