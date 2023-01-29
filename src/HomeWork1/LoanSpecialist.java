package HomeWork1;

import java.util.Scanner;

public class LoanSpecialist {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("What is the amount of loan needed?");
        int loan= input.nextInt();
        if(loan<=200000){
            System.out.println("Congratulation! You are approved");
        }else{
            System.out.println("Sorry! You are not qualified for the loan");
        }

    }
}
