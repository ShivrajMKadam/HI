//Program to remove all repeated elements from an array
public class n1_1 {
    public static void main (String[]args)
    {
        int[] arr = { 4, 5, 6, 4, 3, 5, 7 };

        // Sort an array
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                int tmp = 0;
                if (arr[i] > arr[j])
                {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
//prints the sorted element of the array
            System.out.print(arr[i]);
        }

//for removing duplicate element
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[i] == arr[j])
                {
                    arr[i] = -1;
                }
            }
        }

        System.out.println ("Removed array is:");
        for (int i = 0; i < arr.length; i++)
            if (arr[i] != -1)
            {
                //Arrays.sort (arr[i]);
                System.out.print ("\t" + arr[i]);
            }
    }
}
