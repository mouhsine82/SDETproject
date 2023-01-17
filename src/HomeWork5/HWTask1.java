package HomeWork5;

public class HWTask1 {
    public static void main(String[] args) {
       /*
        1) Create an array of chars and store grades into it: A,B,C,D,E,F.
         Then print a grade B (use 2 different ways of creating an array).
        */
        // First way

        char[] letters = {'A', 'B', 'C', 'D', 'E', 'F'};
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == 'B') {
                System.out.println(letters[i]);
            }
        }
        //Second way

        char[] letters1 = new char[6];

        letters1[0] = 'A';
        letters1[1] = 'B';
        letters1[2] = 'C';
        letters1[3] = 'D';
        letters1[4] = 'E';
        letters1[5] = 'F';
        for (int i = 0; i < letters1.length; i++) {
            if (letters1[i] == 'B') {
                System.out.println(letters1[i]);

            }


        }
    }
}
