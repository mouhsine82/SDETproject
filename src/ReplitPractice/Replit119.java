package ReplitPractice;

public class Replit119 {
    /*
    Replace all instances of given character with a "*" within the given String.
Examples:
censorLetter("computer science",'e') ==> "comput*r sci*nc*"
censorLetter("trick or treat",'t') ==> "*rick or *rea*"
     */
    String censorLetter(String str, char ch) {
        String newStr="";
        newStr=str.replace(ch,'*');
        return newStr;
    }
    public static void main (String[]args){
        Replit119 main=new Replit119();
        System.out.println(main.censorLetter("computer science", 'e'));
        Replit119 main1=new Replit119();
        System.out.println(main1.censorLetter("trick or treat", 't'));
    }
}
