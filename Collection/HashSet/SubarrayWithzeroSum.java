package Collection.HashSet;

import java.util.HashSet;

public class SubarrayWithzeroSum {

    public static boolean isZeroSum(int[] arr) {
        HashSet<Integer> hs= new HashSet<>();
        int preSum=0;
        for(int i=0;i<arr.length;i++) {
            preSum= preSum+arr[i];
            if(hs.contains(preSum)) {
                return true;
            }
            else {
                hs.add(preSum);
            }
        }
        return false;

    }
    public static void main(String[] args) {

        int[] arr= {1,4,13,-3,-10,5};
        boolean isHavingZeroSum= isZeroSum(arr);
        System.out.println(isHavingZeroSum);
    }
}
