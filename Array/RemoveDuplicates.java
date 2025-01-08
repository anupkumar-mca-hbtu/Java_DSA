package Array;

import java.util.ArrayList;

public class RemoveDuplicates {

    public static void removeDuplicate(int arr[]) {
        int res=0;
        //int j=0;
        ArrayList<Integer> al= new ArrayList<>();
        for(int i=1;i<arr.length;i++) {
            if(arr[i-1]!=arr[i]) {

                al.add(arr[i-1]);

            }
        }
        System.out.println(al);
    }
    public static void main(String[] args) {

        int arr[]= {1,1,1,1,3,4,5,5,5};
        removeDuplicate(arr);

    }

}
