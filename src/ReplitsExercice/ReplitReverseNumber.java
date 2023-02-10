package ReplitsExercice;

import java.util.Scanner;

public class ReplitReverseNumber {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int[] arr=new int[5];
        arr[0]=input.nextInt();
        arr[1]=input.nextInt();
        arr[2]=input.nextInt();
        arr[3]=input.nextInt();
        arr[4]=input.nextInt();


        for (int i =arr.length-1;i>=0; i--) {

            System.out.println(arr[i]);



        }

    }
}
