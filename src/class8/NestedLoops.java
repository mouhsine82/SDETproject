package class8;

public class NestedLoops {
    public static void main(String[] args) {
       // output nested for loop 0 to 4  5 times instead write the code 5 times==> too long
        for (int i = 0; i < 5; i++) { //called outer for loop
            for (int j = 0; j < 5; j++) { //called inner for loop
                System.out.println(j);

            }
            System.out.println("***********");

        }
    }
}
