package com.syntaxReview8;

public class FurnitureTester {
    public static void main(String[] args) {

        Furniture chair=new Chair(); // this is upcasting all method comes from Parent class
        chair.assemble();
        chair.comfort(); // runtime polymorphism
        //proof that method breaks is not overriden
        chair.breaks();// since we are not overriding methods breaks will be executed from parent
                      // this is also not the right way to call static method
        Furniture table=new Table();
        table.assemble();
        table.comfort(); // runtime polymorphism

        Table table1=new Table();
        table1.assemble();
        table1.comfort();
        table1.buildTable("Wood");// compile polymorphism

        Chair.breaks();
        Furniture.breaks();// static method called by using class name


        //proof that method breaks is not overridden




    }
}
