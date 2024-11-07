package Nov.ex06112024Constructor1;

public class SonyTV {
    String model ;
    int year;
    int x;
    int y;
    int z;
    int a;
    int b;


    //Default Constructor
    SonyTV(){
         model = "M1";
         year = 2000;
        System.out.println("Default Sony TV Constructor");
    }

    //Parameterized Constructor
    SonyTV(String model,int year,int x,int y){
        this.model = model;
        this.year = year;
        x=x;
        y=y;
        System.out.println("Sony TV parameter Constructor  ");
    }



    //Method
    void work()
    {
        System.out.println("Sony TV is working");
    }
    void feature(int a, int b)
    {
        this.a=a;
        this.b=b;
        System.out.println("Sony TV has features");
        System.out.println(a);
        System.out.println(b);

    }
}
