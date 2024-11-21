package Nov.ex18112024_Exception;

public class Task_Exception_Customize {
    public static void main(String[] args) throws Exception {
    bank sbi = new bank("INR", 10000);
    bank icici = new bank("INR", 2000);
        System.out.println(sbi.add(icici));
        bank hip = new bank("USD",100);
        System.out.println(sbi.add(hip));
    }
}

 class bank
{
    private String currency;
    private Integer amount;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public bank(String currency, Integer amount) {
        this.currency = currency;
        this.amount = amount;
    }
//If we have another bank account than sum the amount of all account
public Integer add(bank bankname) throws Exception
{
            if(!bankname.currency.equalsIgnoreCase("INR"))
            {
                throw new Exception("Currency mismatch, can't proceed");
            }
            return bankname.amount + this.amount;
        }
        //If we dont want customize exception we can added by try catch
//         if(!bankname.currency.equalsIgnoreCase("INR"))
//    {
//        try
//        {
//            throw new Exception("Currency mismatch, can't proceed")
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }
}
