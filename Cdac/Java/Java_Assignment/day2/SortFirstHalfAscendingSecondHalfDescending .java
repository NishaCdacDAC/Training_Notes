
//*Java Program for Sorting first half in Ascending order and second half in Descending order*?

public class SortFirstHalfAscendingSecondHalfDescending 
{
    public static void main(String[] args) 
    {
        int[] arr = {5, 8, 2, 10, 7, 4, 9, 3};
        int length = arr.length;

        if (length % 2 != 0) 
        {
            System.out.println("Array length should be even.");
            return;
        }

        int halfLength = length / 2;

        // Sort the first half in ascending order
        
        for (int i = 0; i < halfLength - 1; i++) 
        {
            for (int j = i + 1; j < halfLength; j++) 
            {
                if (arr[i] > arr[j])
                 {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Sort the second half in descending order
        for (int i = halfLength; i < length - 1; i++) 
        {
       
            for (int j = i + 1; j < length; j++)
             {
                if (arr[i] < arr[j]) 
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Print the sorted array
        
        System.out.println("Sorted Array:");
        for (int num : arr) 
        {
            System.out.print(num + " ");
        }
    }
}
