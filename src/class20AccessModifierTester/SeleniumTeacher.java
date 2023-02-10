package class20AccessModifierTester;

import class20.Teacher;

public class SeleniumTeacher extends Teacher {
    public static void main(String[] args) {


        // testing features and methods of class20 package in class20_1 package.(only public access modifier is available)
        // With the inheritance.
        SeleniumTeacher selenium= new SeleniumTeacher();
        selenium.homework(); //public
        selenium.grade(); //protected available through the inheritance
        //selenium.scholarship(); //default not available
    }
    }

