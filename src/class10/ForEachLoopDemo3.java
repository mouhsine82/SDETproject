package class10;

public class ForEachLoopDemo3 {
    public static void main(String[] args) {
        /*
        Limitations of Foreach loop
         */


        int[] arr={10,13,20,25,45,50};
        // we can't update the element in for each loop bcz don't have access to the index. only print

        for (int x:arr){
            if(x%2!=0){
               x=0;
            }
        }







    }
}

