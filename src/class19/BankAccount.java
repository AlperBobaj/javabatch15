package class19;

public class BankAccount {

    long accountNumber;
    double money;
    void deposit(){
        System.out.println("Deposit methods from Bank account class");
    }
}
    class Checking extends  BankAccount{ // child class or sub class or derived class
    double interest;
    void transfer(){
        System.out.println("transfer from Checking class");
    }

}
   class Savings extends BankAccount{

    double profit;
    void takeProfit(){
        System.out.println("Profit method from Savings");
    }


   }
   class SuperSavings extends Savings{

    void superSavings(){
        System.out.println("Super saving method from super saving class");
    }
   }
