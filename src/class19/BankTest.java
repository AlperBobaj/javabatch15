package class19;

public class BankTest {
    public static void main(String[] args) {


        BankAccount ba=new BankAccount();
        ba.accountNumber=7473545443748l;
        ba.money=1000;
        ba.deposit();

        System.out.println(ba.accountNumber);
        System.out.println(ba.money);

        System.out.println("----Creating an Object----");

        Checking check=new Checking();
        //features from parent
        check.accountNumber=5765;
        check.money=780;
        //features from checking class itself
        check.interest=0;

        check.deposit(); //from parent
        check.transfer();//from child

        Savings save=new Savings();
        save.accountNumber=875638387473874l;
        save.money=7657;
        save.profit=100;
        save.profit=100;


        save.deposit();//from parent
        save.takeProfit();//comes from savings


    }
}
