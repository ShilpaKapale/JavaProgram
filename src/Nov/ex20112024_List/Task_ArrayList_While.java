package Nov.ex20112024_List;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_ArrayList_While {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();

        String continueInput = "Y";

        while(continueInput.equalsIgnoreCase("Y"))
        {
            System.out.println("Enter Name");
            String name = s.nextLine();
            names.add(name);

            System.out.println("Enter age");
            int age = s.nextInt();
            ages.add(age);

            s.nextLine();
            System.out.println("Do you want to enter another record? (Y?N): ");
            continueInput = s.nextLine();
        }
    }
}
//OUTPUT
//Enter Name
//koi
//Enter age
//45
//Do you want to enter another record? (Y?N):
//Y
//Enter Name
//nai
//Enter age
//40
//Do you want to enter another record? (Y?N):
//n