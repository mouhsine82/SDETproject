package JavaProjects;

public class JPTask_8 {
    public static void main(String[] args) {

        /*
        8)Write a Java Program to print the first 10 numbers of Fibonacci series.
         */
      int num1=0;
      int num2=1;
      int num3;
        for (int i = 0; i <10 ; i++) {

            System.out.print(num1+"  ");
            num3=num1+num2;
            num1=num2;
            num2=num3;

        }



    }
}
