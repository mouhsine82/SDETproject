package class7;

public class WhileRecap {
    public static void main(String[] args) {

      /*
      while loop help us repeat many codes and help us reduce numbers of
      lines of codes.
      Syntax whileloop: is always boolean
      while(condition)
       */
        int number=10;
        while (number<20){
            System.out.println(number<20);
            if(number<15){
                System.out.println("number is still less than 15");
            }else {
                System.out.println("Number is greater than 15 now");
            }
            System.out.println(number);
            number++; // increases the value of number variable by one when ever executed

        }






    }

}
