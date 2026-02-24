package Collection.ArrayList;
import java.io.StringBufferInputStream;
import java.util.*;

public class DuplicateElement {

    public static void duplicateElement(List<String> items) {
        HashSet<String> hs= new HashSet<>();
        for(String item: items) {
            if(!hs.add(item)) {
                System.out.println(item);
            }
        }
    }
    public static void main(String[] args) {
        List<String> items= Arrays.asList("Apple","Banana","Orange","Banana","Guava","Apple");
        duplicateElement(items);
    }
}
