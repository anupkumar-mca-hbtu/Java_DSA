package SortingAlgo;


public class SelectionSort {


    //int a[]= {10,5,13,6,17,8}; {5,10,13,6,17,8}


    public static void selectionSort(int arr[]) {

        for(int i=0;i<arr.length;i++) {
            int min_index=i;
            for(int j=i;j< arr.length;j++) {
                if(arr[j]<arr[min_index]) {

                    min_index=j;
                }
            }
            int temp= arr[min_index];
            arr[min_index]=arr[i];
            arr[i]=temp;
        }
    }

    public static void main(String[] args) {

        int a[]= {10,5,13,6,17,8};
        System.out.print("original array is : ");
        for(int i=0;i< a.length;i++) {
            System.out.print( + a[i] + " ");
        }
        System.out.println();
        selectionSort(a);
        System.out.print("sorted array is : ");
        for(int i=0;i< a.length;i++) {
            System.out.print( + a[i] + " ");
        }
    }
}
