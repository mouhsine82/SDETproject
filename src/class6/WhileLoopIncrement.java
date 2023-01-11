package class6;

public class WhileLoopIncrement {
    public static void main(String[] args) {

        int number = 1;
        while (number < 5) {
            System.out.println(number);// this will print from 1 till 4 coz 4<5
            number++;
        }
        ///////////////////////////////////////////////////
        System.out.println("*********************************");
        int number2 = 0;
        while (number2 <= 10) {
            System.out.println(number2);
            number2 += 2;// this will increment by 2 from 0 to 10
        }
        System.out.println("*******************");
        int number3 = 1;
        while (number3 <= 100) {
            System.out.println(number3);
            number3++;// this will print from 1 to 100
        }
        System.out.println("****************");
        int number4 = 1;
        while (number4 <= 15) {
            System.out.println(number4);
            number4 += 2;// this will print from 1 to 15 increment by 2 will be odd numbers
        }
        System.out.println("*********************");
        int number5 = 5;
        while (number5 <= 50) {
            System.out.println(number5);
            number5 += 5;// this will print from 5 to 50 increment by 5 till 50
        }
        System.out.println("*******************");
        int number6 = 1;
        int sum = 0;
        while (number6 <= 5) {
            sum = sum + number6;
            number6++;
        }
        System.out.println(sum);// this will keep adding the number to the sum then increment by 1
        // and keep going till reach number<=5
        System.out.println("************************");
        int num = 1;
        boolean flag = true;
        while (flag) {
            System.out.println(num);
            if (num > 3) {
                flag = false;

            }
            num++;
        }
        System.out.println("******************************");

        while (true) { // this will print infinity coz its true, false will not print anything.
            System.out.println("Hello world");
        }



    }

    }

