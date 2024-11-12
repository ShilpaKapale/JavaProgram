package Nov.ex09112024_Encapsulation_1_Real;

public class Baseclass {

    public Baseclass()
    {
        System.out.println("DC");
    }

    public Baseclass(String browser)
    {
        this.browser = browser;
        System.out.println("PC ");
    }

    public String getBrowser()
    {
        return browser;
    }

    public void setBrowser(String browser,boolean isAuth)
    {
        if(isAuth)
        {
            this.browser = browser;
        }
        else
        {
            System.out.println("Not Allowed");
        }
    }

    private String browser;

    void openbrowser()
    {
        System.out.println("Opening Browser!" );
    }

//@overide method
    void openbrowser(String browsername)

    {
        System.out.println("Open Browser!" +browsername);
    }

    void closebrowser()

    {
        System.out.println("Closing Browser!" );
    }


}
