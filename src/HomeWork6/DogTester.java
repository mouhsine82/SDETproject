package HomeWork6;

public class DogTester {
    public static void main(String[] args) {
        // Husky
        Dog husky= new Dog();
        husky.name="Ricky";
        husky.age=14;
        husky.color="Silver";
        husky.breed="Siberian Husky";
        husky.gender="Male";
        husky.eat();
        husky.run();
        husky.sleep();
        System.out.println("****************************");
        // Bulldog
        Dog bulldog= new Dog();
        bulldog.name="Max";
        bulldog.age=12;
        bulldog.color="Fawn & White";
        bulldog.breed="English bulldog";
        bulldog.gender="Female";
        bulldog.run();
        bulldog.eat();
        bulldog.sleep();
        System.out.println("**********************");
        //Labrador
        Dog labrador= new Dog();
        labrador.name="Cooper";
        labrador.age=10;
        labrador.color="Black";
        labrador.breed="Labrador Retriever";
        labrador.gender="Male";

        labrador.eat();
        labrador.run();
        labrador.sleep();


    }
}
