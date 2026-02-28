package DSA_90Days;

/*Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]


Constraints:

        1 <= nums.length <= 104
        -231 <= nums[i] <= 231 - 1

Follow up: Could you minimize the total number of operations done? */


public class MoveZeros {
    /*
# Brute-Force Approach T.C= O(n*n)  S.C= O(1)
public int moveZeros(int[] nums) {
    int k=0;
    for(int i=0;i<nums.length;i++) {
        for(int j=i;j<nums.length;j++) {
            if(nums[j]!=0) {
                int temp= nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                k=i;
                break;
            }
        }
    }
    return k;
}
*/
     public void moveZeros(int[] nums) {
         int k = 0;

         for (int i = 0; i < nums.length; i++) {
             if (nums[i] != 0) {
                 nums[k++] = nums[i];
             }
         }

         while (k < nums.length) {
             nums[k++] = 0;
         }

     }

    // Optimal -Approach T.C = O(n) S.C= O(1)
    public static void main(String[] args) {
        int[] nums= {0,1,0,3,12};
        MoveZeros mvs= new MoveZeros();
     mvs.moveZeros(nums);
        for(int i=0;i< nums.length;i++) {
            System.out.print(nums[i]+" ");
        }

    }
}
