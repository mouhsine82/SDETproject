package class25;

public interface Movable {
    void move();
}
interface OwnAble{
    void own();
}
 class Car implements Movable, OwnAble{

    public void move(){
        System.out.println("I can move");
    }

     @Override
     public void own() {
         System.out.println("you can own it");
     }
 }
class Dog implements Movable, OwnAble{

    @Override
    public void move() {
        System.out.println("I can move");
    }

    @Override
    public void own() {
        System.out.println("you can own me");
    }
}

