package HomeWork4;

public class Hw4Task6 {
    public static void main(String[] args) {

        // star patterns
        for (int i = 1; i <= 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
        for (int i = 1; i <= 4; i++) {
            for (int j = 0; j <4- i  ; j++) {
                System.out.print("* ");


            }
            System.out.println();
        }
    }
}
