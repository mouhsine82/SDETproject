package HomeWork3;

public class OddNumberIncreforloops {
    public static void main(String[] args) {

        //Print odd numbers between 20 and 50 (2 ways)

        // 1st way

        int num=21;
        for (num=21;num<=49 ;num+=2) {

            System.out.println(num);


        }
        System.out.println("******************************");

        // 2nd way


        for (int num1=21; num1 <=49 ;num+=2) {
            if(num1%2 !=0) {
                System.out.println(num1);
            }
        }








    }
}

