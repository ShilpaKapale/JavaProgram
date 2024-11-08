package Nov.ex06112024Constructor3;

import java.util.Scanner;

public class Lab_Constructor2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the model name");
        String model_name_input = sc.next();

        System.out.println("Enter the year ");
        int year_input = sc.nextInt();


        Car1 t1 = new Car1(model_name_input, year_input);
        System.out.println(t1.year);
        System.out.println(t1.model);

        t1.display();
    }
}

class Car1 {
    String model;
    int year;

    // Parameterized constructor
    Car1(String model, int year)
    {
        System.out.println("PC");
        this.model = model;
        this.year = year;
    }

    void display()
    {
        System.out.println("Car Details -> " + this.model + " - "+ this.year);
    }


}
