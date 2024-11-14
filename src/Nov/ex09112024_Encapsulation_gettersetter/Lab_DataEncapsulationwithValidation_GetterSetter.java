package Nov.ex09112024_Encapsulation_gettersetter;

public class Lab_DataEncapsulationwithValidation_GetterSetter {
    public static void main(String[] args) {

    }
}

class BankAccount
{
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance>=0)
        {
            this.balance = balance;
        }
        else
        {
            System.out.println("Can't be Negative Balance");
        }
    }
public void deposit(double amount)
    {
        if(amount>0) {
            balance = balance + amount;
        }
        else
        {
            System.out.println("Amount is Invalid");
        }
    }


}
