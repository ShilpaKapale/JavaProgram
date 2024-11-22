package Nov.ex19112024_Generic.Understand;

public class No_Genericclass {
    public static void main(String[] args) {
    test t = new test("Sathis","Vell");
    t.display();
  //  test t = new test(3423,23423);//boz we are passing different datatype
    }
}
//Not a generic class
class test
{
    String e1;
    String e2;
    public test(String input1, String input2) {
        this.e1 = input1;
        this.e2 = input2;
    }
public void display()
{
    System.out.println(this.e1+" "+this.e2);

}

}