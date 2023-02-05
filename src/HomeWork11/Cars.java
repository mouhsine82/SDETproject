package HomeWork11;

public  class Cars {
    /*
    Write program to inherit class A that has method printF which is static and call or reuse that method into class B
     */
    String make;
    String model;

    void printF(){
        System.out.println("printF method from cars class");
    }
}

class Truck extends Cars{
    int year;
    double price;

    void trailer(){
        System.out.println("trailer method from Truck class");
    }


}
