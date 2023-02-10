package class21;

public class Animal {

    String name;
    String color="Black";

}
class Cat extends Animal{
    int age;
    double weight;
    String color="White";
void printColor(){
    String color="Blue";
    System.out.println(color); // will print Blue
    System.out.println(this.color);// will print white
    System.out.println(super.color);// will print Black
}
}
