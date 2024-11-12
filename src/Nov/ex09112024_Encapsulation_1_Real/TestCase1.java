package Nov.ex09112024_Encapsulation_1_Real;

public class TestCase1 extends Baseclass{

    public TestCase1()
    {
        super();
        System.out.println("DC - TC1");
    }

    public void Start_TestCase()
    {
        openbrowser("Chrome");
        closebrowser();
    }

    @Override
    public void setBrowser(String browser,boolean isAuth)
    {
        System.out.println("Own Logic");
        super.setBrowser(browser,isAuth);
    }
}
