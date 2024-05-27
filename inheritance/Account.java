package inheritance;

public abstract class Account {
    int acc_no;
    String name;
    double balance;

    int data=100;

    public Account()
    {
        
    }
    public Account(int acc_no,String name, double balance)
    {
        this.acc_no=acc_no;
        this.name=name;
        this.balance=balance;

    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    
}
