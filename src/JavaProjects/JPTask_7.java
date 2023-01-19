package JavaProjects;

public class JPTask_7 {
    public static void main(String[] args) {
        /*
        7)Write a java program to check whether a given number is prime or not?
         */


        int num=79;
        boolean prime=true;
        for (int i = 2; i <num ; i++) {
            if(num % i==0){
                prime=false;
                break;
            }
            
        }
        System.out.println(prime);
    }
}
