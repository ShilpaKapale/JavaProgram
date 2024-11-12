package Nov.ex08112024_Polymorphism_methodoverloading;

public class Polymorphism_methodoverloading
{
    public static void main(String[] args)

    {

        Mathoperation m = new Mathoperation();
        m.Add();
        System.out.println(m.Add(456,7346));
        System.out.println(m.Add(10.56,28.78));

    }

}

class Mathoperation
{
    void Add()
    {
        System.out.println("Addition Operation");
    }

    int Add(int a, int b)
    {
      return a+b;
    }

    float Add(float a, float b)
    {
        return a+b;
    }
    double Add(double a,double b)
    {
        return a+b;
    }
    double Add(double a, double b, float c)
    {
        return a+b+c;
    }

}
