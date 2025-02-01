package BinarySearch;

public class FindElement {

    public static int elementSearch(int[] arr, int element) {
        int low=0, high=arr.length-1;

        while(low<=high) {

            int mid= (low+high)/2;
            if(arr[mid]==element) {
                return mid;
            }
            else if(arr[mid]>element) {
                high=mid-1;

            }
            else low=mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {

        int[] arr=  {1,2,3,4,6};
        int found_index= elementSearch(arr,6);
        System.out.println(found_index);
    }
}
