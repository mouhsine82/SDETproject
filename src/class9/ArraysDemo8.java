package class9;

public class ArraysDemo8 {
    public static void main(String[] args) {


       double[] arr={10.5,12.0,45,10.5,23,10.5};
       //write a program that can tell us how many times the number 10.5 is present in the array.

        int count=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==10.5){
                count++; // to increase the count to find more same value in the array
            }
        }

        System.out.println(count);



        }

    }



