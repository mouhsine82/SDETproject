package HomeWork8;

public class StringReverse {
    private static String s;

    public static void main(String[] args) {
        /*
        4) How would you reverse a String word by word? for example
        // input=>This is sentence i want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever
         */


        String str="This is sentence i want to reverse";
        String [] arr=str.split(" ");

        for (String word:arr) {
           for (int i=word.length()-1;i>=0;i--){
               System.out.print(word.charAt(i));
           }
            System.out.print(" ");
        }


        System.out.println("***** Shorter way using StringBuilder *****");
        /*
        String str="This is sentence i want to reverse";
        String [] arr=str.split(" ");
         for(String word:arr){
             System.out.print(new StringBuilder(word).reverse()+" ");
         }
*/

        }
    }


