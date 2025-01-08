package Array;

import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicatesFromUnsorted {

    public static void removeDuplicatesFromUnsoretd(int arr[]) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        ArrayList<Integer>al= new ArrayList<>();

        for(int i=0;i<arr.length;i++) {
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        for(int i=0;i<arr.length;i++) {
            if(hm.containsKey(arr[i]) && hm.get(arr[i])>=1) {
                al.add(arr[i]);
                hm.put(arr[i],0);
            }
        }
        System.out.println(al);

    }
    public static void main(String[] args) {
        int []arr= {4,3,9,2,4,1,10,89,34};
        removeDuplicatesFromUnsoretd(arr);
    }
}
