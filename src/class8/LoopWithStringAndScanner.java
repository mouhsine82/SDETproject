package class8;

import java.util.Scanner;

public class LoopWithStringAndScanner {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        while (input.next().equalsIgnoreCase("Mike")){
            System.out.println("Great student");
        }




    }
}
