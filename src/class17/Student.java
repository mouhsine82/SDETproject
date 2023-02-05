package class17;

public class Student {
    /*
    create a class call it Student define 4 instance fields like id name age weight
    create 5 objects of this class do this task with constructors.
     */

    String name;
    String id;
    int age;
    double weight;


    Student(String studentName, String studentId, int studentAge, double studentWeight){
        name=studentName;
        id=studentId;
        age=studentAge;
        weight=studentWeight;
    }
    void studentInfo(){
        System.out.println("Name "+name+" student ID "+id+" age "+age+" weight "+weight);
    }
}

