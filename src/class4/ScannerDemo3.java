package class4;

import java.util.Scanner;

public class ScannerDemo3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Are you ready?");
        boolean ready=input.nextBoolean();
        System.out.println("We are ready for holidays "+ready);

    }
}
