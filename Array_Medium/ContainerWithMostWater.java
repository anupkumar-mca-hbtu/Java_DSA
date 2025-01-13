package Array_Medium;

public class ContainerWithMostWater {

    public static int maxWater(int arr[]) {
        // Code Here
        int left= 0;
        int right= arr.length-1;
        int max_water= 0;

        while(left<right) {
            int max= Math.min(arr[left],arr[right])*(right-left);
            max_water= Math.max(max, max_water);

            if(arr[left]<arr[right]) {
                left++;
            }
            else {
                right--;
            }
        }
        return max_water;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4, 5};
        int max_water= maxWater(arr);
        System.out.println(max_water);
    }

}
