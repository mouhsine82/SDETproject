package class23;

public class ClassStudentTester {
    public static void main(String[] args) {
        // achieving run time polymorphism with help of overriding
        ClassStudent[] students = {new SyntaxStudent(), new CollegeStudent(), new SchoolStudent()};

        for (ClassStudent student : students) {
                student.breakTime();
                student.extraCredit();
                student.graduate();
        }
    }
}
