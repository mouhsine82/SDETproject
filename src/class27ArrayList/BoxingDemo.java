package class27ArrayList;

public class BoxingDemo {
    public static void main(String[] args) {

        int number1=15;
        printData(number1);

        Integer f=10;   // autoBoxing
        int number2=f; //autoUnboxing
    }
    public static void printData(Integer number){ //auto boxing converting int data type to Integer class
        System.out.println(number);
    }
}
