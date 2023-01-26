package HomeWork7;

public class HwTask2 {
    public static void main(String[] args) {
        /*
        2) Create a String and print it in reverse order (Sunday → yadnuS).
         */



        String day="Younes Boukhris";
        for (int i=day.length()-1;i>=0 ;i--) { // <== this is better// or===> For (int i=5; i>=0; i--)
            System.out.print(day.charAt(i));
        }
    }
}
