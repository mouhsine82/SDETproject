package class20;

public class SportTester {
    public static void main(String[] args) {

        Cricket crick=new Cricket("Cricket","Pakistan","Green Helmet");
        crick.display();

        Soccer soccer=new Soccer("Soccer","Morocco","Raja",11);
        soccer.display();
        soccer.displayTeam();
    }
}
