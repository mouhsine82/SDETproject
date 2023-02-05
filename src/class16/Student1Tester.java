package class16;

public class Student1Tester {
    public static void main(String[] args) {

        Student1 student=new Student1();
        student.name="Mouhsine";
        student.id="123";
        student.age=22;
        student.weight=70;
        student.schoolName="Syntax";

        Student1 student1=new Student1();
        student1.name="Anes";
        student1.id="456";
        student1.age=5;
        student1.weight=86;
        //  student1.schoolName="Syntax";

        Student1 student2=new Student1();
        // student2.name="Younes";
        student2.id="789";
        student2.age=26;
        student2.weight=90;
        // student2.schoolName="Syntax";

        System.out.println(student2.schoolName);
        System.out.println(Student1.schoolName); // another way that you might see a lot to access static variables
        System.out.println(student2.name);

    }
}
