package com.designpattern.Client;
import com.designpattern.Enums.CarType;
import com.designpattern.Enums.Location;
import com.designpattern.FactoriesAndCarSubClasses.CarFactory;

public class CarClient {
	
	public static void main(String[] args) {
		System.out.println(CarFactory.buildCar(CarType.MICRO,Location.USA)); 
		System.out.println("------------------------------------------------");
        System.out.println(CarFactory.buildCar(CarType.MINI,Location.INDIA)); 
        System.out.println("------------------------------------------------");
        System.out.println(CarFactory.buildCar(CarType.LUXURY,Location.DEFAULT));
        System.out.println("------------------------------------------------");
	}
}
