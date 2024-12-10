package Array_Medium;

public class MaximumProductSubarray {

    public static long maximumsubarrayProduct(int arr[]) {
     long maxProduct=Long.MIN_VALUE;

     for(int i=0;i<arr.length;i++) {
        long product=1;
         for(int j=i;j<arr.length;j++) {

             product=product*arr[j];
             if(product>maxProduct) {
                 maxProduct=product;
             }
         }
     }
     return maxProduct;
    }

    public static void main(String[] args) {
       /*  Input: arr[] = [6, -3, -10, 0, 2]
        Output: 180
        Explanation:  The subarray [6, -3, -10] gives max product as 180.

        Input: arr[] = [2, 3, 4, 5, -1, 0]
        Output: 120
        Explanation: The subarray [2, 3, 4, 5] gives max product as 120.

         Input: arr[] = [2, 3, 4]
         Output: 24
          Explanation: For an array with all positive elements, the result is product of all elements.
         */
        int arr[]= {3, 12, 15, 23, 33, -35, 30, -40, -30, -30, -30, 26, 28};
        System.out.println("Max product Subarray is: "+ maximumsubarrayProduct(arr));

    }
}
