package class13;

public class StringRecap {
    public static void main(String[] args) {

        //how can I print the letters from this String one by one

        String str="Java is Great";
        for (int i = 0; i <str.length(); i++) {
            System.out.println(str.charAt(i));

        }
        //what is the input to the chart
        //
        int count=0;
        for (int i = 0; i <str.length() ; i++) {
           if(str.charAt(i)=='a'){
               count++;
           }

        }
        System.out.println("Letter a has appeared "+count+" many times");



    }
}
