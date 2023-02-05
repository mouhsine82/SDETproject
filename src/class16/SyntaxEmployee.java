package class16;

public class SyntaxEmployee {
 /*
Create a Class called SyntaxEmployee:
Create three  variables  empID , salary and set the CEO to “Sumair”
Create two objects of the class SyntaxEmployee
Set the value of eID, salary for each of the objects
Print out the eID , salary and  CEO for each of the objects
     */

    int empID;
    double salary;
   static String CEO="Sumair";// is going to be same we create this one as static

    public static void main(String[] args) {

        SyntaxEmployee employee=new SyntaxEmployee();
        employee.empID=4567;
        employee.salary=120000;


        SyntaxEmployee employee1=new SyntaxEmployee();
        employee1.empID=1234;
        employee1.salary=100000;
        System.out.println(employee.empID);
        System.out.println(employee.salary);
        System.out.println(employee.CEO);



    }
}
