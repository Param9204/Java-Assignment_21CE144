//I'D:21CE144
//Name:Param Thumar
import java.util.Scanner;
class CheckAccount extends Account{

    private double OverdraftLimit;
    //here we use getter setter
    public double getOverdraftLimit() {
        return this.OverdraftLimit;
    }

    public void setOverdraftLimit(double OverdraftLimit) {
        this.OverdraftLimit = OverdraftLimit;
    }
    //here we use Default Constructor
    CheckAccount()
    {
        super();
        OverdraftLimit = -10;
    }
    //here we use paramiterrized constructor
    CheckAccount(int id,double balance,double over)
    {
        super(id,balance);
        OverdraftLimit = over;
    }
    //here we make some methods for application
    public void withdraw(double amount)
    {
        if(getBalance() - amount < OverdraftLimit)
        {
            System.out.println("Overdraft Limit warning..!! \n You Cannot withdraw Money");
        }
        else
        {
            amount = getBalance() - amount;
            setBalance(amount);
        }
    }
    //toString function will print all data in String formate
    public String toString()
    {
        return (super.toString() + "\nOverDraft Limit:- " + getOverdraftLimit());
    }
}
