package BinarySearch;

public class IndexOfFirstOccurence {
//  Iterative Approach
    public static int firstIndex(int[] arr, int low, int high, int x) {
        while(low<=high) {
            int mid= low+high/2;
            if(arr[mid]==x ) {
                if(mid==0 ||arr[mid-1]!= x) {
                return mid;
                } else  {
                    high= mid-1;
                }
            }
            else if(arr[mid] >x) {
                high= mid-1;
            } else {
                low=mid+1;
            }
        }
        return -1;
    }

    // Recurssive Approach
    public static int firstIndexRecursive(int[] arr, int low, int high, int x) {
        if(low>high) {
            return -1;
        }
        int mid= low+high/2;
        if(arr[mid]==x) {
            if(mid==0 || arr[mid-1]!=x) {
                return mid;
            }
            else {
                return firstIndexRecursive(arr,low,high-1,x);
            }
        } else if(arr[mid] >x) {
            return firstIndexRecursive(arr,low,high-1,x);
        } else {
           return firstIndexRecursive(arr,low+1,high,x);
        }
    }
    public static void main(String[] args) {
        int[] arr= {10,10,10,10,10,10,10};
        int res= firstIndex(arr,0,arr.length-1,10);
        int res1= firstIndexRecursive(arr, 0, arr.length-1,10);
        System.out.println("res with iterative : " +res);
        System.out.println("res with recursive : " +res1);
    }

}
