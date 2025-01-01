package Oct.ex29102024_Array;

public class Task_Array_SumofArray_method {

    static int array[] = {45,68,34,66};

    static int sum(){
        int sum =0;
        int i;

        for(i=0;i< array.length;i++)
        {
            sum=sum+array[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Sum of all items is :" +sum());
    }
}
