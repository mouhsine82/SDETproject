package Class14;

import java.util.Scanner;

public class MethodsDemo2 {

     void printHello(){  // defining a method
         System.out.println("Hello world");
     }

     void printHelloManyTimes(int times) { // this method is more usefull coz we control the input(time)
         for (int i = 0; i < times; i++) {
             System.out.println("Hello World");
         }
     }


       void printManyTimes(int times,String word){

           for (int i = 0; i <times ; i++) {
               System.out.println(word);

           }
       }

     }




