package class12;

public class CarTester {
    public static void main(String[] args) {

        // create the object of the class

        Car bmw=new Car();
        bmw.make="BMW";
        bmw.model="i7";
        bmw.year=2020;
        bmw.color="Grey";

        bmw.moveForward();
        bmw.applyBrakes();

        Car audi=new Car();
        audi.make="BMW";
        audi.model="E-tron";
        audi.year=2020;
        audi.color="Grey";

        audi.moveForward();
        audi.applyBrakes();



    }
}
