package class8;

public class ContinueKeywordDemo1 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i % 3 == 0) { //this line is same as: if(i==3 || i==6 || i==9){
                continue;// works as skip
            }
            System.out.println(i); // this line will not execute  if i=3,6,9


        }
    }
}

