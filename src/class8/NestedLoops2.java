package class8;

public class NestedLoops2 {
    public static void main(String[] args) {
    // this will print 10 line of stars each line has 5 stars
        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 5; j++) {

                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("**************************");

    }
}
