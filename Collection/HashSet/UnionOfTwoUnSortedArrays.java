package Collection.HashSet;

import javax.print.attribute.IntegerSyntax;
import java.util.HashSet;
import java.util.Iterator;

public class UnionOfTwoUnSortedArrays {

    public static void findUnion(int[] arr1, int[] arr2) {
        HashSet<Integer> hs= new HashSet<>();
        for(int i=0;i<arr1.length;i++) {
            hs.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            hs.add(arr2[i]);
        }
        Iterator<Integer> i= hs.iterator();
        while(i.hasNext()) {
            System.out.print(i.next() +" ");
        }

    }
    public static void main(String[] args) {
        int[] nums1= {15,20,5,10};
        int[] nums2= {15,15,15,20,10};
        findUnion(nums1,nums2);
    }
}
