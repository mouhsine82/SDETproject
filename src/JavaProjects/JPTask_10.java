package JavaProjects;

import java.util.Scanner;

public class JPTask_10 {
    public static void main(String[] args) {

   /*
   10)Write a java program to find the second-largest number in the array.
    */
        int[] arr={113,23,43,167,1590};

        int largest=arr[0];
        int secondLargest=arr[0];

        for (int i = 0; i < arr.length ; i++) {

            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }

        }

        System.out.println("The 2nd largest number in the array is: "+secondLargest);




    }
}
