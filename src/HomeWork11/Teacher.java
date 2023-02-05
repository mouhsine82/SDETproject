package HomeWork11;

public class Teacher {
    /*
    Write a Java program called Teacher.  Identify features and 4 behaviour of that Class.
    Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher that would have it
    their own features and behaviour. Test all 4 classes
     */
    String name;
    String subject;
    int age;

    void dailyHw(){
        System.out.println("Homework is due the following day");
    }
    void WeeklyTest(){
        System.out.println("Be prepare for test everyweek");
    }
    void grading(){
        System.out.println("Grades available in canvas");
    }
    void rewards(){
        System.out.println("Top 3 students get rewards");
    }
}
class MathTeacher extends Teacher{
    String Book;
    boolean materials;

    void test(){
        System.out.println("Math weekly test");
    }
}
class ChemistryTeacher extends Teacher{
    String experiment;

    void project(){
        System.out.println("Monthly experiment");
    }
}
class PianoTeacher extends Teacher{
    boolean hasMaterial;

    void practiceTime(){
        System.out.println("Practice daily for the event");
    }
}

