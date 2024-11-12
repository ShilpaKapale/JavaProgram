package Oct.ex29102024;
// Not working need to check
import static Oct.ex29102024.BS.bs;

public class Task_Array_BinarySearch
{
    public static void main(String[] args)
    {
    //General Form of Java Array Initialization
        int Marks[] = {76,65,89,58,97,55};
        int start = 0;
        int end = Marks.length;
        int t_element = 65;

        int index = bs(Marks, start,end,t_element);
        System.out.println("Element found at index: " +index);
    }

}
    class BS
    {
     public static int bs(int[] Marks,int start, int end, int t_element)
       {

         if (end >= start)
         {
             int mid = start + (end - start) / 2;
             if (Marks[mid] == t_element)
             {
                 return mid;
             }

             if (Marks[mid] < t_element)
             {
                 return bs(Marks, mid + 1, end, t_element);
             }
          if (Marks[mid] > t_element)
         {
            // return bs(Marks, start, mid - 1, t_element);
             end = mid;
         }
         }
         return -1;
     }
    }

