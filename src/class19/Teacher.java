package class19;

public class Teacher {

    String name;
    int teacherId;
    String subject;


    Teacher(String name, int teacherId){
        this.name=name;
        this.teacherId=teacherId;
    }

    Teacher(String name, int teacherId, String subject){
         this(name, teacherId);  //this.name=name;  we don't have to repeat it again
                                 //this.teacherId=teacherId; we don't have to repeat it again
         this.subject=subject;
    }
}
