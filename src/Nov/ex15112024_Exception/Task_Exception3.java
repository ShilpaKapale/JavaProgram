package Nov.ex15112024_Exception;

public class Task_Exception3 {
    public static void main(String[] args) {

            System.out.println("Stat");


            String s1 = null;
            try {
                s1.trim();//Unchecked jvm does not know during complie time but it know during runtime hence it will end the program
            }
            catch (Exception e)
            {
                //System.out.println(e.getMessage());
                System.out.println("Can't do trim for Null");
            }
            System.out.println("End");
        }

}
