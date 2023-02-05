package class19;

public class BankAccountTester {

    public static void main(String[] args) {


        BankAccount ba=new BankAccount();
        ba.accountNumber=1234567890;
        ba.money=1000;
        ba.deposit();
       // ba.transfer ===> methods from child class not available in parent class
        System.out.println(ba.accountNumber);
        System.out.println(ba.money);

        System.out.println("----  creating an object of Checking class ");

        Checking check=new Checking();
        // features come from parent
        check.accountNumber=1113456012;
        check.money=500;
        check.interest=5;

        check.deposit();// from parent
        check.transfer();// from child

        System.out.println("----  creating an object of Savings class ");

        Savings save=new Savings();
        save.accountNumber=472625546;
        save.money=200;
        save.profit=50;
        // save.interest=5; siblings features are not available

        save.deposit(); // from parent
        save.takeProfit(); // from savings
        //save.transfer  not available

        // finish creating SuperSavings object and see which feature available to that class

        System.out.println("------    creating an object of SuperSavings class");

        SuperSavings save2=new SuperSavings();
        save2.accountNumber=76548332;
        save2.rewardPoints=234;
        save2.profit=50;
        save2.money=350;
        //save2.interest  not available from checking class
        save2.superSave();
        save2.takeProfit();
        save2.deposit();
        //save2.transfer(); not available from checking class.
    }
}
