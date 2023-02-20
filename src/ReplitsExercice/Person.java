package ReplitsExercice;

public class Person {


    String name;
    String lastName;
    int age;

    Person(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }
}

     class Employee extends Person {
        int salary;

        Employee(String name, String lastName, int age, int salary) {
            super(name, lastName, age);
            this.salary = salary;
        }

      void display1(){
          System.out.println(name+lastName+age+" "+salary);
      }
    }

     class Student extends Person {
        int grade;

        Student(String name, String lastName, int age, int grade) {
            super(name, lastName, age);
            this.grade = grade;
        }
        void display2(){
            System.out.println(name+lastName+age+" "+grade);
        }
    }

    class Retiree extends Person {
        String seniorActivity;

        Retiree(String name, String lastName, int age, String seniorActivity) {
            super(name, lastName, age);
            this.seniorActivity = seniorActivity;

        }
        void display3(){
            System.out.println(name+lastName+age+seniorActivity);
        }


        }






