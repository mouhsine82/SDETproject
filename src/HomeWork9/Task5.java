package HomeWork9;

public class Task5 {
    //5) Write a method to return whether given number is prime or not?

    boolean primeNum(int num) {
        if (num>1) {
            for (int i=2; i<num; i++) {
                if (num%i==0) {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;

    }

    // Student tester
   public static void main(String[] args) {

       Task5 prime=new Task5();
       System.out.println(prime.primeNum(79));

   }




}
