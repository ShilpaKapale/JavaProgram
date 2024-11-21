package Nov.ex18112024_Exception;

public class Task_Exception_Finally {
    public static void main(String[] args) {
        int a = 0;//When error  this line n check finally will be executed
       //int a = 1;//When no error uncomment this n check finally will be executed
        int c= 0;
        try {
            c = 10 / a;
            System.out.println(c);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally // Used to close the connection i.e. DB, Scanner
        {       //Its like exit block
            System.out.println("I am alway executed if error or no error");
        }
    }
}
