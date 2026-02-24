package Java8.interviewQuestions;
import java.util.*;

public class SecondHighestSalary {
    public static void main(String[] args) {
        List<Integer> sal= new ArrayList<>();
        sal.add(12000);
        sal.add(16000);
        sal.add(8000);
        sal.add(12300);
        sal.add(11600);

        Optional<Integer> opt= sal.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        opt.ifPresent(System.out::println);
    }
}
