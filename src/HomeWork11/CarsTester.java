package HomeWork11;

import class12.Car;

public class CarsTester {
    public static void main(String[] args) {

        Cars car1=new Cars();
        car1.make="Tesla";
        car1.model="Model 3";
        car1.printF();

        Truck truck=new Truck();
        truck.make="Chevy";
        truck.model="Silverado";
        truck.price=120000;
        truck.year=2021;
        truck.trailer();
        truck.printF();


    }
}
