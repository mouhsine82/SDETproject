package class20AccessModifierTester;

import class20.JavaTeacher;

public class University {
    public static void main(String[] args) {

        // testing features and methods of class20 package in class20_1 package.(only public access modifier is available)
        // With No inheritance.
        JavaTeacher  jt=new JavaTeacher();
        jt.homework(); //public available in entire project
        //jt.grade(); // protected not visible in different package
        //jt.scholarship(); //default not visible in different package
        //jt.extraPoint(); // private not visible
    }
}
