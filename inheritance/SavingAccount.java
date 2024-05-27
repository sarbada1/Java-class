package inheritance;

public abstract class SavingAccount extends Account {
    double interest_rate;
    double min_balance;
    @Override
    public void deposit(double amount)
    {
        balance+=amount;
        System.out.println(amount+" balance deposited to account ");
    }

    @Override
    public void withdraw(double amount)
    {
        if(balance-min_balance>amount)
        {
            balance-=amount;
            System.out.println(amount+"balance successfully withdrawn");
        }
    }
}
