package Nov.ex09112024_Encapsulation_gettersetter;

public class Lab_Encapsulation_GS {
    public static void main(String[] args) {

    }
}
class vmologin
{
    public String username;
    public String password;

    public vmologin(String username, String password)
    {
        this.username = username;
        this.password = password;
    }
}
class GoodVMOlogin{

    public String username;
    public String password;

    public GoodVMOlogin(String username, String password)
    {
        this.username = username;
        this.password = password;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword(boolean isAdmin)
    {
        if(isAdmin) {
            return password;
        }
        return "None";
    }

    public void setPassword(String password,boolean isAdmin)
    {
       if(isAdmin)
       {
           this.password = password;
       }
       else
       {
           System.out.println("Not Allowed");
       }
    }


}