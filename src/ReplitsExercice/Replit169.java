package ReplitsExercice;

public class Replit169 {
    /*
    Create final method avgElements that will average all the elements in an integer array
    (passed to the method as a parameter) and return the average.
**Expected Output:**
4.8
     */

    public static void main(String[] args) {
        int[] a = {2,7,3,8,4};
        System.out.println(avgElements(a)); //should print 4.8
    }
    double avgElements;
    public static final double avgElements(int[] a){
        double sum=0;
        for(int num :a){
            sum+=num;
        }
        return sum/a.length;
    }
}

