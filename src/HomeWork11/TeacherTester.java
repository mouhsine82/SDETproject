package HomeWork11;

public class TeacherTester {
    public static void main(String[] args) {

        Teacher teacher=new Teacher();
        teacher.name="Jane";
        teacher.age=27;
        teacher.dailyHw();
        teacher.WeeklyTest();
        teacher.grading();

        MathTeacher math=new MathTeacher();
        math.name="Rick";
        math.age=34;
        math.materials=true;
        math.test();
        math.grading();
        math.dailyHw();

        ChemistryTeacher chemistry=new ChemistryTeacher();
        chemistry.name="Deba";
        chemistry.age=29;
        chemistry.dailyHw();
        chemistry.grading();
        chemistry.project();


        PianoTeacher piano=new PianoTeacher();
        piano.name="Chris";
        piano.age=27;
        piano.WeeklyTest();
        piano.practiceTime();

    }
}
