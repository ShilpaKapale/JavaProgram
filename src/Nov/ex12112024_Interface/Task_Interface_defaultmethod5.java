package Nov.ex12112024_Interface;

public class Task_Interface_defaultmethod5
{
    public static void main(String[] args)
    {
        Rectangle1 r = new Rectangle1();
        r.draw();
        r.msg();//its picking the interface default method as rectangle class hasnt overrided
        Drawable1 c = new Circle1();
        c.draw();
        c.msg();//its picking the circle default method as its overrided by circle
    }
}

interface Drawable1
{
    void draw();
    //Default method
    default void msg()
    {
        System.out.println("default method of interface");
    }
}
//interface Drawables
//{    //If we want to add or upgrade the featuer of application than user can't
//    // add new methods to exsisting infterace and if try to add it in new interface
//    //than we need add in multiple subclass which is tedious so Java has interduced
//    //default method which can or can't be overriden by subclass in exsisting interface
//    void msg();
//}
class Rectangle1 implements Drawable1{
    public void draw()
    {
        System.out.println("I am Rectangle");
    }
}

class Circle1 implements Drawable1 {
    public void draw()
    {
        System.out.println("I am Circle");
    }
    //Circle overriding default method
    public void msg()
    {
        System.out.println("default method override by circle");
    }
}
class Square implements Drawable1{
    public void draw()
    {
        System.out.println("I am Square");
    }
}
