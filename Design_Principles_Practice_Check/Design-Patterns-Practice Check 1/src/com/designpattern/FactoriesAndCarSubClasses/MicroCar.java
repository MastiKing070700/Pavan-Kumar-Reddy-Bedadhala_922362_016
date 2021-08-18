package com.designpattern.FactoriesAndCarSubClasses;

import com.designpattern.Enums.CarType;
import com.designpattern.Enums.Location;

class MicroCar extends Car 
{ 
    MicroCar(Location location) 
    { 
        super(CarType.MICRO, location); 
        construct(); 
    } 
    @Override
    protected void construct() 
    { 
        System.out.println("Connecting to Micro Car "); 
    } 
} 