package Collection.HashSet;

import java.util.HashSet;

public class IntersectionOfTwoUnSortedArray {

    public static void findIntersection(int[] arr1, int[] arr2) {

        // keep in view that both the arrays should contain distinct elements.
        HashSet<Integer> hs= new HashSet<>();
        for(int i=0;i<arr1.length;i++) {
            hs.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++) {
            if(hs.contains(arr2[i])){
                System.out.print(arr2[i] +" ");
            }
        }
    }


    public static void main(String[] args) {
      int[] nums1= {10,20,30};
      int[] nums2= {30,10};
      findIntersection(nums1,nums2);

    }
}
