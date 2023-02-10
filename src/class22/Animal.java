package class22;

public class Animal {
    String name;
    String color;
    int age;
    double weight;
    void speak(){
        System.out.println("Animals can speak");
    }
    void eat(){
        System.out.println("All the animals eat");
    }
}
class Cat extends Animal{
    // we are overriding speak method in cat class From Animal class(Base class)
    void speak(){
        System.out.println("Meow Meow..."); // this method is override from parent class//
    }
}
class Dog extends Animal{

}
class Tester{
    public static void main(String[] args) {
    Cat cat=new Cat();
    cat.speak();
    }
}
