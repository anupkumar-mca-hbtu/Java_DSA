package Java8.Lamda.Predicate;


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicatePersonAge {

    private String name;
    private int age;

    public PredicatePersonAge(String name, int age) {

        this.name= name;
        this.age=age;
    }

    public static void main(String[] args) {
        PredicatePersonAge p1= new PredicatePersonAge("Rohan",17);
        PredicatePersonAge p2= new PredicatePersonAge("Rohit",22);
        PredicatePersonAge p3= new PredicatePersonAge("Ram",28);
        PredicatePersonAge p4= new PredicatePersonAge("Akash",18);
        PredicatePersonAge p5= new PredicatePersonAge("Sumit",24);
        List<PredicatePersonAge> person= Arrays.asList(p1,p2,p3,p4,p5);

       Predicate<PredicatePersonAge> pd= p -> p.age>18;

       for(PredicatePersonAge p:person) {
           if(pd.test(p)) {
               System.out.println(p.name);
           }
       }
    }



}
