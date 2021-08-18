package com.designpattern.categories;

import com.designpattern.beans.Bottle;
import com.designpattern.interfaces.Item;
import com.designpattern.interfaces.Packing;

public abstract class ColdDrink implements Item {

	@Override
	public Packing packing() {
       return new Bottle();
	}

	@Override
	public abstract float price();

}
