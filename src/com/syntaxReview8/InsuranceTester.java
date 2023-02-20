package com.syntaxReview8;

public class InsuranceTester {
    public static void main(String[] args) {

        // can I create an object of Insurance class--->NO, since it is abstract.
        // but we can create it indirectly from child class

        Insurance carPolicy=new CarPolicy("ASD1234","Mouhsine",800,22);
        carPolicy.getInsurance();
        System.out.println(carPolicy.calculateCoverage());


        Insurance petPolicy=new PetPolicy("GFD4566","Olena",140,2);
        petPolicy.getInsurance();
        System.out.println(petPolicy.calculateCoverage());



    }
}
