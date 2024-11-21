package Nov.ex15112024_Exception;

public class Task_Exception1 {
    public static void main(String[] args) {
        System.out.println("Start of program");

        String IP = args[0];
        int a = Integer.parseInt(IP);
        int b = 1000/a;
        System.out.println(b);
//ArrayIndexOutOfBoundsException when a =         (blank)
// NumberFormatException when a = pramod
        //ArithmeticException when a = 0
        System.out.println("End of program");
    }
}
