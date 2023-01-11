package class6;

public class WhileLoop4 {
    public static void main(String[] args) {

        boolean condition = true;
        int number = 0;
        while (condition) { // this required boolean true or false.
            System.out.println("hello world");
            if (number > 3) {
                condition = false;
            }// this will be false till the number reach 3
            number++; //this will increment by 1 till reach false condition
        }
        System.out.println("******************************");

        int num = 0;
        while (num < 10) {

            if (num % 2 == 0) {
                System.out.println("Even " + num);
            }
            num++;
        }
        System.out.println("********************");
        // print 1 2 3 4  6 7 8 9 11 12 13 14 16 (2 ways)
        // first way using OR and if else
        int num2 = 1;
        while (num2 <= 16) {
            if (num2 == 5 || num2 == 10 || num2 == 15) {

            } else {
                System.out.println(num2);
            }
            num2++;

            System.out.println("*****************");
            //second way using modules %. this better way to write above code.
            int num3 = 1;
            while (num3 <= 16) {
                if (num3 % 5 == 0) {

                } else {
                    System.out.println(num3);
                }
                num3++;
                System.out.println("********************");
                //////////////////////////////////////

                // 3rd way using ! NOT
                int num4=1;
                while (num4<=16){
                    if(num4%5!=0){
                        System.out.println(num4);
                    }
                    num4++;
                }


            }
        }
    }
}






