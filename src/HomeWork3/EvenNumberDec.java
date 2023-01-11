package HomeWork3;

public class EvenNumberDec {
    public static void main(String[] args) {

        //Print even numbers from 20 to 1 (2 ways)

        // 1st way ***************************************************
        int num=20;
        while (num>=0){
            System.out.println(num);
            num-=2;
        }
        System.out.println("******************");

        // 2nd way *****************************************************
        int num1=20;
        while (num1>=0){
            if(num1%2==0)
                System.out.println(num1);
            num1-=2;
        }





    }
}
