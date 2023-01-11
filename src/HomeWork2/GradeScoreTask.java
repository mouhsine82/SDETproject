package HomeWork2;

import java.util.Scanner;

public class GradeScoreTask {
    public static void main(String[] args) {
        /*3) Write a program that will read three inputs of scores (quiz, mid term, and final scores)
        and determine the grade based on the following rules:
         if the average score >=90 → grade=A
        if the average score >= 70 and <90 → grade=B
        if the average score>=50 and <70 → grade=C
        if the average score<50 → grade=F
                */
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter your quiz score:");
        double quiz = input.nextDouble();
        System.out.println("Please Enter your mid term score:");
        double midTerm = input.nextDouble();
        System.out.println("Please Enter your final score:");
        double finalScore = input.nextDouble();
        double average = quiz + midTerm + finalScore;
        double finalAverage=average/3;
        System.out.println("Your average score is " + finalAverage);

        if (finalAverage >= 90) {
            System.out.println("Your grade is A");

        } else if (finalAverage >= 70 && finalAverage < 90) {
            System.out.println("Your grade is B");

        } else if(finalAverage>=50 && finalAverage<70) {
            System.out.println("Your grade is C");

        } else if(finalAverage<50){
            System.out.println("Your grade is F");

        }








    }
}
