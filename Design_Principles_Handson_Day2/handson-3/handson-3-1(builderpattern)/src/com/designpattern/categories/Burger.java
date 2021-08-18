package com.designpattern.categories;

import com.designpattern.beans.Wrapper;
import com.designpattern.interfaces.Item;
import com.designpattern.interfaces.Packing;

public abstract class Burger implements Item {

	 @Override
	   public Packing packing() {
	      return new Wrapper();
	   }
	
	 @Override
	   public abstract float price();

}
