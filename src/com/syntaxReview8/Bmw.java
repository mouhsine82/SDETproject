package com.syntaxReview8;

import com.syntaxReview7.Car;

public class Bmw extends Car {

    Bmw(String make, String model){
        super(make, model);
    }
    public void start(){
        System.out.println(make+" starts with push start button");
    }
    public  String drive(String typeOfDriving){
        System.out.println(make+" drive "+typeOfDriving);
        return typeOfDriving;
    }
    void brake(){
        System.out.println(make+" brakes");
    }
}
