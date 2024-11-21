package Nov.ex19112024_Generic;

public class Task_Genric1 {

        public static void main(String[] args) {
            tempsum(24,45);
            tempsum("Hello"," Everyone");
        }
        public static <T> T tempsum(T a, T b)
        {
            System.out.println(a);
            System.out.println(b);
            return null;
        }

    }


