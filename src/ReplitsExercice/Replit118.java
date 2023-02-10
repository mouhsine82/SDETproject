package ReplitsExercice;

public class Replit118 {

    /*
    Insert spaces after every character in the String s, then return the new string.

See below examples (note the space at the end as well).
     */
    String space="";
    String spaceOut(String s){
        for(int i=0 ; i<s.length();i++){
            space+=s.charAt(i)+" ";
        }
        return space;
    }


    public static void main (String[]args){
        Replit118 main=new Replit118();
        System.out.println(main.spaceOut("hello"));
    }
}


