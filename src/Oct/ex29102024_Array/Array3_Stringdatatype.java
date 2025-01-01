package Oct.ex29102024_Array;

public class Array3_Stringdatatype {
    public static void main(String[] args) {
        //Creating array Name object
        String Name[] = new String[3];

       //Initializing and Accessing a Specific Element in a Java Array
        Name[0] = "Abc";
        Name[1] = "Xyz";
        Name[2] = "Pqr";

        System.out.println("1st element Data of Name array: "+Name[0]);

        //General Form of Java Array Initialization
        String Product[] = {"TV","Phone","UPS"};

        Product[0] = "TV";
        Product[1] = "Phone";
        Product[2] = "UPS";

        System.out.println("Data of Product array: "+Product[1]);

        boolean B[] = new boolean[2];
        B[0] = true;
        B[1] =  false;

        System.out.println("Length of array B: " +B.length);

    }
}
