package HomeWork3;

public class EvenNumberDecForLoop {
    public static void main(String[] args) {

        //Print even numbers from 20 to 1 (2 ways)

        // 1st way ***************************************************
        int num=20;
        for (num =20; num>=1; num-=2) {
            System.out.println(num);

        }
        System.out.println("******************");

        // 2nd way *****************************************************
        int num1=20;
        for (num1= 20; num1 >=1 ; num1-=2) {

            if(num1%2==0)
                System.out.println(num1);

        }





    }
}
