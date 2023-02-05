package class16;

public class Students {
     /*
     Create a Class called Students
Create three  variables  Name , ID  and  numberOfStudents
Create three objects of the Students Class
Set the value for  studentName , studentID and increment  the numberOfStudents for each object
Print out  total number of students
     */

    String name;
    String ID;
   static int numberOfStudents;


    public static void main(String[] args) {

        Students stud=new Students();
        stud.name="Mouhsine";
        stud.ID="M1234";
        stud.numberOfStudents++;

        Students stud1=new Students();
        stud1.name="Younes";
        stud1.ID="Y345";
        stud1.numberOfStudents++;

        Students stud3=new Students();
        stud3.name="Anes";
        stud3.ID="A578";
        stud3.numberOfStudents++;

        System.out.println(Students.numberOfStudents);

    }
}
