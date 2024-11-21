package Nov.ex12112024_Interface;

public class Task_Interface2 {
    public static void main(String[] args) {

        Rectangle r = new Rectangle();
        r.draw();
        Circle c  = new Circle();
        c.draw();
    }
}

interface Drawable
{
    void draw();
}

class Rectangle implements Drawable
{
    public void draw()
    {
        System.out.println("I am Rectangle");
    }

}
class Circle implements Drawable
{
    public void draw()
    {
        System.out.println("I am circle");
    }
}
