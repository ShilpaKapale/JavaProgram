package Nov.ex12112024_Interface;

public class Task_Interface_Staticmethod6 {
    public static void main(String[] args) {
    Rectangle2 r = new Rectangle2();
    r.draw();
        System.out.println(Drawable2.cube(8));
    }
}

interface Drawable2
{
    void draw();
    static  int cube(int x)
    {
        return x*x*x;
    }
}

class Rectangle2
{
    public void draw()
    {
        System.out.println("I am Rectangle");
    }
}