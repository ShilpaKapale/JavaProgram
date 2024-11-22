package Nov.ex19112024_Generic.Understand;

public class With_Genericclass_multipleparameterdatatype {

        public static void main(String[] args) {
            test2<String,Integer> p = new test2<String,Integer>("Sathis",33);
            p.display();
            test2<Integer,String> p1 = new test2<Integer,String>(560023,"Bangalore");
            p1.display();
            test2<String,Double> p2 = new test2<String,Double>("Mouse",33.67);
            p2.display();
            //Dont use premitive datatype as generic use only object

//Here we use same class for two different types of input String and Integer thats significance of generic
        }
    }
    //Generic class with multiple parameter of same data type
    class test2<T,U>
    {
        T e1;
        U e2;
        public test2(T input1, U input2) {
            this.e1 = input1;
            this.e2 = input2;
        }
        public void display()
        {
            System.out.println(this.e1+" "+this.e2);

        }



}
