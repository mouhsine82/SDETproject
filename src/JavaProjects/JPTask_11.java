package JavaProjects;

public class JPTask_11 {
    public static void main(String[] args) {

        /*
        11)Write a program to print out duplicate elements from an Array of Strings
         */

        String[] animals={"Cat","Dog","Fish","Cat","Tiger","Lion","Dog","Tiger"};
        for (int i = 0; i < animals.length; i++) {
            for (int j = i+1; j < animals.length ; j++) {
                if(animals[i].equals(animals[j])){
                    System.out.println(animals[i]);
                }
                
            }

        }







    }
}
