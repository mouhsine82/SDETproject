package class19;

public class BankAccount { //parent class or super class or base class

    long accountNumber;
    double money;

    void deposit(){
        System.out.println("Deposit methods from bank account class");
    }


}

class Checking extends BankAccount{ // child class or subclass or derived class

    double interest;
    void transfer(){
        System.out.println("Transfer methods from checking account");
    }
}
class Savings extends BankAccount{ //extends only 1 class

    double profit;
    void takeProfit(){
        System.out.println("Profit methods from Saving class");
    }
}

class SuperSavings extends Savings{

    int rewardPoints;
    void superSave(){
        System.out.println("superSave methods from SuperSavings class ");
    }
}
