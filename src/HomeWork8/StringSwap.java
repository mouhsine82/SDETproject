package HomeWork8;

public class StringSwap {
    public static void main(String[] args) {
        /*
        6) How would you swap  2 strings without a temporary variable?
         */
        String a = "Mouhsine";
        String b = "Boukhris";

        a = a + b;  // a = "MouhsineBoukhris"
        b = a.substring(0, a.length() - b.length()); // b = "Mouhsine"
        a = a.substring(b.length()); // a = "Boukhris"

        System.out.println("String a= " + a);
        System.out.println("String b= " + b);
    }
}
