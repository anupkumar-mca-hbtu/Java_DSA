package Collection.HashSet;

public class SubarrayWithGivenSum {

    public static boolean subarraySum1(int[] arr1, int sum) {
        for(int i=0;i<arr1.length;i++) {
            int subSum= 0;
            for(int j=i;j<arr1.length;j++) {
                subSum=subSum+arr1[j];
                if(subSum==sum) {
                    return true;
                }
                else if(subSum>sum) {
                    break;
                }
            }
        }
        return false;
    }
    // first Naive approach

    public static void main(String[] args) {
        int[] arr = {5,8,6,13,3,-1};
        boolean isSum= subarraySum1(arr,22);
        System.out.println(isSum);

    }
}
