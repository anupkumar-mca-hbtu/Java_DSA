package Collection.HashSet;

import java.util.HashSet;

public class PairWithGivenSum {

    public static boolean pairSum(int[] arr, int target) {
        HashSet<Integer> hs= new HashSet<>();

        for(int i=0;i<arr.length;i++) {
            Integer x= target-arr[i];
            if(hs.contains(x)) {
                return true;
            }
            else {
                hs.add(arr[i]);
            }
        }
        return false;
    }
    public static void main(String[] args) {
         int[] arr1= {3,2,8,15,-8};
         int[] arr2= {2,1,6,3};
         boolean result= pairSum(arr1,6);
          System.out.println(result);
    }
}
