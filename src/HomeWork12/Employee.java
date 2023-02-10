package HomeWork12;

public class Employee {
    /*
    2. Create an Employee class that will have variables and methods. Constructor that should initialize instance variables
Create 2 subclasses FullTime.java and PartTime Employees that should have own variables and methods.
Create a Tester Subclass from FullTime.java Employee and add some features and methods to the Tester Class.
     */

    String name;
    int id;
    int age;

    Employee(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    void breakTime() {

    }
}

    class FullTime extends Employee {

        String address;
        int salary;

        FullTime(String name, int id, int age, String address, int salary) {
            super(name, id, age);
            this.address = address;
            this.salary = salary;
        }

        void hardWorker() {

        }

        void displayInfo() {
            System.out.println("Name: " + name + " ID: " + id + " Salary: " + salary);
        }
    }

        class PartTime extends Employee {

            int phoneNum;
            String startDate;

            PartTime(String name, int id, int age, String address, int salary, int phoneNum, String startDate) {
                super(name, id, age);
                this.phoneNum = phoneNum;
                this.startDate = startDate;
            }


            public static void main(String[] args) {
                FullTime employee = new FullTime("Mo", 2314, 40, "123 ABC ave", 760000);
                employee.hardWorker();
                employee.breakTime();
                employee.displayInfo();


            }
        }




