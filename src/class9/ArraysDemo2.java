package class9;

public class ArraysDemo2 {
    public static void main(String[] args) {
        // store this numbers 10 20 30 40 50 in an arrays.
        // and add all the numbers from an array
        int[] numbers = {10, 20, 30, 40, 50};
        int sum=0;
        for (int i = 0; i <numbers.length; i++) {
            sum = sum + numbers[i]; //adding all numbers

        }
        System.out.println(sum);
    }
}