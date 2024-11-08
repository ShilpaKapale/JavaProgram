package Nov.ex06112024Constructor4;
//Constructor Overloading
public class Constructor_Overloading {
    public static void main(String[] args) {

        Car2 t = new Car2("SOS",2011);
        System.out.println(t.model);
        System.out.println(t.year);
        t.display();

        Car2 t1 = new Car2("MOM");
        System.out.println(t1.model);
        t1.display();
    }
}
class Car2 {
    //Instance Variable
    String model;
    int year;

    // Parameterized constructor 1
    Car2(String model, int year)
    {
        System.out.println("PC1");
        this.model = model;
        this.year = year;
    }
    // Parameterized constructor 2

    Car2(String model)
    {
        System.out.println("PC2");
        this.model = model;

    }


    void display()
    {
        System.out.println("Car Details -> " + this.model + " - "+ this.year);
    }


}