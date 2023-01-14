package class8;

import java.util.Scanner;

public class RecapDemo2 {
    public static void main(String[] args) {
        //10 8 6 4 2 for loop
        for (int i = 10; i >=2 ; i-=2) {
            System.out.println(i);


        }
        System.out.println("*****************");

        Scanner fetch=new Scanner(System.in);
        System.out.println("Please Enter the number");
        int x=fetch.nextInt();
        for (int i = 0; i < x; i++) {
            System.out.print(i+" "); // print prints the numbers on the same line +" " adds space after each number
        }
        System.out.println();
    }
}
