package Array_Medium;

public class LongestSubarrayWithSumK {

    public static int longestSubarrayWithSumK(int[] arr, int k) {
        int max_count=0;

        for(int i=0;i<arr.length;i++) {
            int sum=0;
            for(int j=i;j<arr.length;j++) {
                sum=sum+arr[j];
                if(sum== k) {
                    max_count= Math.max(max_count, j+1-i);
                }
            }
        }
        return max_count;
    }

    public static void main(String[] args) {
        int[] arr= new int[]{10, 5, 2, 7, 1, -10};
        int max_length= longestSubarrayWithSumK(arr,15);
        System.out.println("Longest subarray is : " + max_length);
    }
}
