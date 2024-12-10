package Java8.Lamda.Predicate;

import java.util.function.Predicate;

public class PredicateNameEx {

    public static void main(String[] args) {
        String[] names ={"Anushka", "Anupama", "Deepika", "Kajol", "Sunny"};
       Predicate<String> pd= name-> name.charAt(0)=='A';
       for(String name: names) {
           if(pd.test(name)){
               System.out.println(name);
           }
       }
    }
}
