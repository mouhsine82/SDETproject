package HomeWork9;

public class Task1 {
   // 1) Create a method that will take 2 parameters as a numbers
    // and prints which number is larger.

    int largeNumber(int num1,int num2){
        if(num1>num2){
            return num1;
        }else{
            return num2;
        }
    }

    // Student tester
    public static void main(String[] args) {

        Task1 largeNum=new Task1();
        System.out.println(largeNum.largeNumber(65,234));
    }
}
