package com.designpattern.FactoriesAndCarSubClasses;

import com.designpattern.Enums.CarType;
import com.designpattern.Enums.Location;

class MiniCar extends Car 
{ 
    MiniCar(Location location) 
    { 
        super(CarType.MINI,location ); 
        construct(); 
    } 
      
    @Override
    void construct() 
    { 
        System.out.println("Connecting to Mini car"); 
    } 
} 