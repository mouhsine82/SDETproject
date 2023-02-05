package class13;

public class BuilderDemo {
    public static void main(String[] args) {

       StringBuilder str= new StringBuilder();
        for (int i = 0; i <1000 ; i++) {
            str.append(i); // this will print 1000 time which cause slow and more memory, solution switch to StringBuilder
        }               // just click on + for solution to switch to StringBuilder

    }
}
