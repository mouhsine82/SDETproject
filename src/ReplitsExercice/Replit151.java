package ReplitsExercice;

public class Replit151 {
    /*
    **In Method Class:**
Complete static sum2D method by writing an accumulator algorithm that will
 calculate the sum of all the element in the 2D array passed as a parameter.
**In Main Class:**
Create relation between Main class and Method by making Main class as a subclass of the Method Class
Use Array:int[][] a = {{ 1, 2, 3 },{ 4, 5, 6 },{ 7, 8, 9 }};   and execute sum2D method

     */
}
    class Method{
        public static int sum2D(int[][] arr) {
            int sum = 0;
            for (int[] row : arr) {
                for (int element : row) {
                    sum += element;
                }
            }
            return sum;
        }
    }

class Main extends Method {
    public static void main(String[] args) {
        int[][] a = {{ 1, 2, 3 },{ 4, 5, 6 },{ 7, 8, 9 }};
        Method method = new Method();
        int sum = method.sum2D(a);
        System.out.println(sum);
    }
}
