package class15;

public class MPractice3 {
    /*
    create a methode that takes an array of int sum all the elements from the array
    and return the sum
    * return type =>int
    *name of methode => arraySum or ur choice
    *parameters => int [] arr
     */

    int arraySum(int [] arr){

        int sum=0;
        for(int num:arr){
           sum+=num;
        }
        return sum;

    }
}
