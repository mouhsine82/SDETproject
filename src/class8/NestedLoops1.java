package class8;

public class NestedLoops1 {
    public static void main(String[] args) {
       // output 0 to 4  5 times
        for (int i = 0; i < 5; i++) { //called outer for loop
            for (int j = 0; j < 5; j++) { //called inner for loop
                System.out.println("i= "+j+" j= "+j);

            }
            System.out.println("***********");

        }
    }
}
