package Nov.ex09112024_Encapsulation_gettersetter;

public class Lab_Encapsulation_Getter {

    public static void main(String[] args) {

        Get_Array GA = new Get_Array();
        int Arr[] = GA.getElement();
        GA.display();

        Arr[0] = 10;
        System.out.println();

        GA.display();

    }
}
//Here below getter method moves all array element in temp array so that
// modification to array of this class can be restricted
class Get_Array
{
    private int[] element = {8,4,7,1,9};

    int[] getElement()
    {
        int len = element.length;
        int temp[]= new int[len];

        for(int i=0;i<len;i++)
        {
            temp[i]=element[i];
        }
        return temp;
    }

    void display()
    {
        int len = (this.element).length;

        for(int i=0; i<len;i++)
        {
            System.out.print(this.element[i] +" ");
        }

    }

}

//class Get_Array
//{
//    private int[] element = {8,4,7,1,9};
//
//    int[] getElement()
//    {
//       return element;// no temp array is not used rather same array element to return
//    }
//
//    void display()
//    {
//        int len = (this.element).length;
//        for(int i=0;i<len;i++)
//        {
//            System.out.print(this.element[i] + " ");
//        }
//
//    }
//
//}