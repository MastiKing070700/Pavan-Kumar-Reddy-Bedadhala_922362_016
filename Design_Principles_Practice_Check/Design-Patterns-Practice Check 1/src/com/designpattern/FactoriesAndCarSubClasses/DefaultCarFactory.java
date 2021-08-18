package com.designpattern.FactoriesAndCarSubClasses;
import com.designpattern.Enums.CarType;
import com.designpattern.Enums.Location;

public class DefaultCarFactory {

	public Car buildCar(CarType carType) {
		switch(carType){
			case LUXURY:
				return new LuxuryCar(Location.DEFAULT);
			case MINI:
				return new MiniCar(Location.DEFAULT);
			case MICRO:
				return new MicroCar(Location.DEFAULT);
		}
		return null;
	}
}
