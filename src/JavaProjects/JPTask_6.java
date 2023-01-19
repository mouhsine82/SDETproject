package JavaProjects;

public class JPTask_6 {
    public static void main(String[] args) {
        /*
        6)Write a program to swap 2 numbers without a temporary variable?
         */

        int x= 5, y = 10;
        System.out.println("Before swapping: x = " + x + ", y = " + y);
        x = x + y;
        y = x -y ;
        x = x - y;
        System.out.println("After swapping: x = " + x + ", y = " + y);



    }
}
