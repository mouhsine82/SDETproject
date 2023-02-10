package ReplitsExercice;

public class Replit117 {
    /*
    calculate the sum of the EVEN integers from 1 to x (including x)
Examples:
sumEvenToX(5) ==> 6
sumEvenToX(8) ==> 20
```
     */
    public int sumEvenToX(int x){
        int sum=0;
        for(int i=2;i<=x;i+=2){

                sum+=i;
            }

        return sum;
    }
    public static void main (String[]args){
        Replit117 s=new Replit117();
        System.out.println(s.sumEvenToX(5));
    }
}
