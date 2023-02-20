package HomeWork10;

public class Students {
    /*
    2)Write a java Class Marks that have a constructor which takes students name and
    3 subject grades. Inside your class also have a method to Calculate Average Grade.
  Test Student class for 5 different students with different marks. Your program should print an average mark of each students name.
NOTE: please use different names for instance and local variables.
     */

    String name;
    int math;
    int english;
    int history;
    int average;
    Students(String studentName, int mathGrade, int historyGrade, int englishGrade){
        name=studentName;
        math=mathGrade;
        english=englishGrade;
        history=historyGrade;

        average=(mathGrade+englishGrade+historyGrade)/3;

    }
    void studentAvgGrade(){
        System.out.println("Student name "+name+" math grade "+math+
                " english grade "+english+" history grade "+history+" The grade average is "+average+"%");
    }





}
