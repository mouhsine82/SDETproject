package class11;

public class CatTester {


    public static void main(String[] args) {

        Cat cat1= new Cat(); // creating an object from the cat class

        cat1.name="lego";
        cat1.breed="Van Cat";
        cat1.age=2;
        cat1.attitude=false;


        cat1.eat();




        Cat cat2= new Cat();
        cat2.name="Tom";
        cat2.breed="Domestic";
        cat2.color="Black";



        cat2.speak();
    }
}
