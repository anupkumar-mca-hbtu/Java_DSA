package SortingAlgo;

public class MergeSort
{
    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;//l--->m->m-l=1
        int n2 = r - m;//m-->r =>r-m//1

        /* Create temp arrays */
        int L[] = new int [n1];
        int R[] = new int [n2];

        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i)
            L[i] = arr[l + i];//[6]
        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];//[5]


        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array//[5,6,,,,,,,]
        int k = l;
        //while (i < n1 && j < n2)
        for(;i < n1 && j < n2;)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using
    // merge()
    void sort(int arr[], int l, int h)//7,6,5
    {
        if (l < h)//0<2
        {
            // Find the middle point
            int mid = (l+h)/2;//0+2/2=1

            // Sort first and second halves
            sort(arr, l, mid);//Sort(a,0,2)->Sort(a,0,1)-> Sort(a,0,0)
            sort(arr , mid+1, h);//Sort(a,3,4) ->Sort(a,2,2)->Sort(a,1,1)

            // Merge the sorted halves
            merge(arr, l, mid, h);
        }

    }

    /* A utility function to print array of size n */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver method
    public static void main(String args[])
    {
        int arr[] = {6,5,3,1,8,7,2,4};

        System.out.println("Given Array");
        printArray(arr);

        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length-1);

        System.out.println("\nSorted array");
        printArray(arr);
    }
}
