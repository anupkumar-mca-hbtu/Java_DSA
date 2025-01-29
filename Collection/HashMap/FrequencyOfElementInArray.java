package Collection.HashMap;

import java.util.HashMap;
import java.util.Map;


public class FrequencyOfElementInArray {

    public static void findFrequency(int[] arr) {
        HashMap<Integer,Integer> hm= new HashMap<>();
        for(int i=0;i<arr.length;i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i],0)+1);

        }
        for(Map.Entry<Integer,Integer> e : hm.entrySet()) {
            System.out.println(e.getKey() +" "+ e.getValue());
        }
    }
    public static void main(String[] args) {

        int arr[]= new int[]{10,12,10,15,10,20,12,12};
        findFrequency(arr);
    }
}
