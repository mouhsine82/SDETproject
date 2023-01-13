package HomeWork3;

public class OddNumberIncre {
    public static void main(String[] args) {

        //Print odd numbers between 20 and 50 (2 ways)

        // 1st way

        int num=21;
        while (num<=49){
            System.out.println(num);
            num+=2;

        }
        System.out.println("******************************");

        // 2nd way

        int num1=21;
        while (num1<=49){
            if(num1%2!=0)
                System.out.println(num1);
            num1+=2;
        }








    }
}
