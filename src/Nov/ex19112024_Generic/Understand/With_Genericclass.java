package Nov.ex19112024_Generic.Understand;

public class With_Genericclass {
    public static void main(String[] args) {
    test1<String> t = new test1<String>("Sathis","Vell");
    t.display();
    //Dont use premitive datatype as generic use only object
        test1<Integer> t1 = new test1<Integer>(534,3245);
        t1.display();
//Here we use same class for two different types of input String and Integer thats significance of generic
}
}
//Generic class with multiple parameter of same data type
class test1<T>
{
    T e1;
    T e2;
    public test1(T input1, T input2) {
        this.e1 = input1;
        this.e2 = input2;
    }
    public void display()
    {
        System.out.println(this.e1+" "+this.e2);

    }

}
