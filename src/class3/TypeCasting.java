package class3;

public class TypeCasting {
    public static void main(String[] args) {
        byte b=10;
        int number2=b;
        short c=(short) number2;
        System.out.println(b);
        /* if we try to store the contents from a smaller box to a larger box java doesn't complain because
        the content can easily fit inside the larger box but if we try the otherway around we get an error
        and we need to type cast it to store the contents.
         */
        // Example:
        float eggs=12.5f;
        int wholePart=(int)eggs; // type casting we are converting from float to an int.
        System.out.println(wholePart);




    }
}
