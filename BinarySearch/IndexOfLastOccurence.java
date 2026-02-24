package BinarySearch;

public class IndexOfLastOccurence {

    //Iterative Approach
    public static int findIndexLast(int[]arr, int low, int high, int x) {
        while(low<=high) {
            int mid= low+(high-low)/2;
            if(arr[mid]==x) {
                if(mid==arr.length-1 || arr[mid+1]!=x) {
                     return mid;
                } else {
                    low=mid+1;
                }
            }
            else if(arr[mid]>x) {
                high= mid-1;
            }
            else if(arr[mid]<x){
                low=mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 10, 10, 10, 10, 10, 10};
        int res = findIndexLast(arr, 0, arr.length - 1, 10);
        System.out.println("res with iterative : " +res);

    }


}
