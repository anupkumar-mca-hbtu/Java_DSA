package Java8.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeDept {

    public static void main(String[] args) {
        List<List<String>> Employee= Arrays.asList(Arrays.asList("John Doe","John smith"),Arrays.asList("Mukul","Anthony"),
                Arrays.asList("Gaurav","Henry"));

       List<String> emp= Employee.stream().flatMap(List::stream).collect(Collectors.toList());
      // System.out.println(emp);
       // [John Doe, John smith, Mukul, Anthony, Gaurav, Henry]
       List<String> nmE= emp.stream().filter(name -> name.startsWith("J")).collect(Collectors.toList());
        System.out.println(nmE);

    }
}
