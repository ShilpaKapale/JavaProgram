package Oct.ex29102024_Array;

import java.util.Arrays;

public class Task_Array_Sort_BinarySearch {
    public static void main(String[] args) {
      //  General Form of Java Array Initialization
        int b[] = {34,123,55,89,12};
        Arrays.sort(b); //Sort function sorts array and store in same array

        //toString function returns a String object representing the value
        System.out.println("Sorted Array is here: " + Arrays.toString(b));

//binarySearch() method can look for a given element in a sorted array and return its index if found.
// Remember, the method returns the index of the found item and not the item itself.
        int index = Arrays.binarySearch(b, 55);

        if(index >= 0)
        {
            System.out.println("Element  found at index : "+ index);
        }
        else
        {
            System.out.println("Element not found");
        }


    }
}
