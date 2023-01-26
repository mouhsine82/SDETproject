package class13;

public class ReplaceAllMethod {
    public static void main(String[] args) {

        String str="KKHDF111XFH8hjcss998845@#$%^&";
        System.out.println(str.replaceAll("[A-Z]","*")); // replace uppercase from range A_Z we can use any range
        System.out.println(str.replaceAll("[a-z]","*"));//replace lowercase from a-z range
        System.out.println(str.replaceAll("[0-9]","*"));// replace number range from 0-9 or any range
        System.out.println(str.replaceAll("[A-Za-z]","*"));//replace multiple range without separation
        System.out.println(str.replaceAll("[A-Za-z0-9]","*"));//replace uppercase lowercase and numbers
        System.out.println(str.replaceAll("[^A-Z]","*"));// ^ this mean DO NOT replace

        System.out.println(str.replaceAll("[A-Z]",""));// this is will remove what's between []
    }
}
