class Account
{
    float totalAmount;
    void withdraw(float amount)
    {
        this.totalAmount-=amount; //this.amount=this.amount-amount;
        System.out.println("Withdraw amount:\t"+amount);
        System.out.println("Total Amount After Withdraw:\t"+totalAmount);
    }
    void deposit(float amount)
    {
        this.totalAmount+=amount; //this.amount=this.amount+amount;
        System.out.println("Deposit amount:\t"+amount);
        System.out.println("Total Amount After Deposit:\t"+totalAmount);
    }
}
class One extends Thread
{   
    Account account;
    One(Account account)
    {   this.account=account;
    }
    @Override
    public void run()
    {   synchronized(account)
        {
            account.deposit(10000);
        }
    }
}
class Two extends Thread
{   
    Account account;
    Two(Account account)
    {   this.account=account;
    }
    @Override
    public void run()
    {   synchronized(account)
        {
            account.withdraw(10000);
        }
    }
}
class Three extends Thread
{   
    Account account;
    Three(Account account)
    {   this.account=account;
    }
    @Override
    public void run()
    {   
            account.deposit(30000);
    }
}
public class SynchronizationDemo 
{   
    public static void main(String[] args) {
        Account account=new Account();
        One t1=new One(account);
        Two t2=new Two(account);
        Three t3=new Three(account);
        t1.start();
        t2.start();
        t3.start();
    }    
}
