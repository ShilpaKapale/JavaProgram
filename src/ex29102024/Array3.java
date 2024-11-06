package ex29102024;

import java.sql.SQLOutput;

public class Array3 {
    public static void main(String[] args) {

        String Name[] = new String[3];

        Name[0] = "Abc";
        Name[1] = "Xyz";
        Name[2] = "Pqr";

        System.out.println("Data of Name array: "+Name[0]);

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
