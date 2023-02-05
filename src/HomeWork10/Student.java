package HomeWork10;

public class Student {
    /*
    5) Write a Student class   that have instance variables name and address.
    Create a constructor that will initialize those variables.
    Print name & address of given  student using displayInfo method.
     */

    String name;
    String address;

    Student(String name, String address){
        this.name=name;
        this.address=address;

    }
    void displayInfo(){
        System.out.println("Student name "+name+" student address "+address);
    }

}
