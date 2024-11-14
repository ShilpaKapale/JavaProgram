package Nov.ex09112024_Encapsulation_gettersetter;

public class Lab_Encapsulation_Setter {

    public static void main(String[] args) {

        Set_Array SA = new Set_Array();

        int Arr[] = {3,8,1,6,9};
        SA.setElement(Arr);
        SA.display();
        Arr[0] = 5;
        System.out.println();
        SA.display();
    }
}
//Temp array is used so that modification is not performed
class Set_Array{
private int[] element;

    void setElement(int [] a)
    {
        int len =a.length;
      element = new int[len];

        for(int i=0;i<len;i++)
        {
           this.element[i]=a[i];
        }
    }

    void display()
    {
        int len = (this.element).length;

        for(int i=0;i<len;i++)
        {
            System.out.print(this.element[i] + " ");
        }
    }

}

//class Set_Array{
//    private int[] element;
//
//    void setElement(int [] a)
//    {
//         this.element=a;
//
//    }
//
//    void display()
//    {
//        int len = (this.element).length;
//
//        for(int i=0;i<len;i++)
//        {
//            System.out.print(this.element[i] + " ");
//        }
//    }
//
//}
