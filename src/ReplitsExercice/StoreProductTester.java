package ReplitsExercice;

public class StoreProductTester {
    public static void main(String[] args) {


        StoreProduct obj = new StoreProduct("Eggs", 3.0, "Produce", true, 10);
        obj.display();

       StoreProduct obj2=new StoreProduct("Paper Towels",2.0,"misc",false,24);
       obj2.display();

       StoreProduct obj3=new StoreProduct("Paper Towels",2.0,"null",false,0);
       obj3.display();
    }
}
