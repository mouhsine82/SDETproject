package HomeWork10;

public class Task_1 {
    /*
    3) Write a java class that have 4 constructors with 4 different access levels
    of constructors(private,public,default,protected) and create 4 objects of
    this class: 1 - inside same class; 2 - from outside the class; 3 - from different class
    inside different package  and observe result.
     */

    private Task_1(){
        System.out.println("Constructor without any parameters");
    }

    Task_1(String name){
        System.out.println("Constructor with a String as parameter");
    }


    protected Task_1(int number){
        System.out.println("Constructor with an int as parameter");
    }


    public   Task_1(char  c){
        System.out.println("Constructor with a char as parameter");
    }

    public static void main(String[] args) {
        Task1 task1=new Task1();
        //Student task2=new Student("Java");
        //Student task3=new Student(1000);
       // Student task4=new Student('G');
    }



}
