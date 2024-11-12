package Oct.ex29102024;
//Get and print 2D array element
import java.util.Scanner;

public class Read_Array_2DObject {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int columns = sc.nextInt();

        int[][] arr = new int[rows][columns];
        //Get array element
        System.out.println("Enter 2D array element");
        for (int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        //Print array element
        System.out.println("Array element are here below: ");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
