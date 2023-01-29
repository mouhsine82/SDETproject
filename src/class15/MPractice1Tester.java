package class15;

public class MPractice1Tester {
    public static void main(String[] args) {

        //call isEven method(from MPractice1 class) for number 15.
        MPractice1 mp=new MPractice1();
        boolean isEven=   mp.isEven(15);
        System.out.println(isEven);

        // call isEven method for the numbers 100 12 20

        MPractice1 mp1=new MPractice1();
        Boolean isEven1= mp1.isEven(100);
        System.out.println(isEven1);

        MPractice1 mp2=new MPractice1();
        Boolean isEven2= mp1.isEven(12);
        System.out.println(isEven1);

        MPractice1 mp3=new MPractice1();
        Boolean isEven3= mp1.isEven(20);
        System.out.println(isEven3);
        // or
       // System.out.println(mp.isEven(12));
        //System.out.println(mp.isEven(100));
    }
}
