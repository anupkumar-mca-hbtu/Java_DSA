package Java8.Lamda.Predicate;


import java.util.function.Predicate;

public class PrediacteDemo {

    public static void main(String[] args) {

        Predicate<Integer> p= i-> i>10;

        System.out.println(p.test(12));
    }


}
