package class15;

public class Dog {

    String name; // instance variables
    String breed; // instance variables
    String color; // instance variables   this is inside the class



    static int noOfLegs=4; // static variables



    void printFood(){
        String food="Meat"; // local variable it's inside a methode and can't be used outside the block
        System.out.println(food);
    }

    void printColor(){
        //System.out.println(food); // error coz its a local variable
        System.out.println(name); // name is instance variable
    }

}
