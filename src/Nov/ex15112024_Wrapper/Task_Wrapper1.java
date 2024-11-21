package Nov.ex15112024_Wrapper;

public class Task_Wrapper1 {
    public static void main(String[] args) {
        int a = 10;
        Integer a1 = 10;
        a1.intValue();//Class and Object java like to work with
        Integer b = a ;//Boxing int to Integer i.e. Wrapping
        System.out.println(Integer.MAX_VALUE);//Attribute
        System.out.println(Integer.MIN_VALUE);//Attribute
        System.out.println(b.intValue());//Behaviour which give the vale of b

        Integer a2 = 42;
        int a3 = a2;//Unboxing
        //System.out.println(a3.);//Losses all the Attribute and Behaviour after a3 value can't be printed

        //Wrapper class used in conversion
        String num = "10";
        //String - Wrapper(Integer) - Primitive int
        Integer c1 = Integer.valueOf(num);
        System.out.println(c1);
        int c2 = c1; //Unboxing
        System.out.println(c2);

        //String to primitive
        int c3 =Integer.parseInt(num);
        System.out.println(c3);

        Long l = 10l;//Very data type has wrapper class
         Short s = 23;
         Boolean bb = true;
    }
}
