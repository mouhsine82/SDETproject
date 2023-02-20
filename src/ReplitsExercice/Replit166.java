package ReplitsExercice;

public class Replit166 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Cat("Cat");
        animals[1] = new Kitten1();
        animals[2] = new Kitten2();
        animals[3] = new Kitten3();
        for (Animal animal : animals) {
            animal.eat();
            animal.sleep();
        }
    }
}
class Animal {
    String type;
     public Animal(String type) {
        this.type = type;
    }
    public void eat() {
        System.out.println(type + " eats");
    }
    public void sleep() {
        System.out.println(type + " sleeps a lot");
    }
}
class Cat extends Animal {
    public Cat(String type) {
        super(type);
    }
    @Override
    public void sleep() {
        System.out.println(type+" sleeps a lot");
    }
}
class Kitten1 extends Cat {
    public Kitten1() {
        super("Kitten1");
    }
    @Override
    public void eat() {
        System.out.println(type+" eats milk");
    }
}
class Kitten2 extends Cat {
    public Kitten2() {
        super("Kitten2");
    }
    @Override
    public void eat() {
        System.out.println(type+" eats snacks");
    }
}
class Kitten3 extends Cat {
    public Kitten3() {
        super("Kitten3");
    }
    @Override
    public void eat() {
        System.out.println(type+" eats everything");
    }
}