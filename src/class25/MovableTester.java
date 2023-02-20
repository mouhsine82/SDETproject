package class25;

public class MovableTester {
    public static void main(String[] args) {
        OwnAble[] ownAbles={new Dog(),new Car()};
        for(OwnAble o:ownAbles){
            o.own();
        }
    }
}
