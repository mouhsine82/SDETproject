package class21;

public class Task2 {
    /*
    Create 1 class with a static method that has 3 overloaded forms. Then call each overloaded method with specific arguments and observe result.
Create 1 class with a private method that has 3 overloaded forms. Then call each overloaded method with specific arguments and observe result.
     */

    static  void method(String str1){
        System.out.println("Method with one String");
    }

    static void method(String str1,String str2){
        System.out.println("Method with 2 String");
    }
    static void method(String str1,String str2,String str3){
        System.out.println("Method with 3 String");
    }

    public static void main(String[] args) {
        method("Java");
        method("Python","Java");
        method("JavaScript","Java","C++");
    }
}
