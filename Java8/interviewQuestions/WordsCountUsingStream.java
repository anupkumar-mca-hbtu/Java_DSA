package Java8.interviewQuestions;

import java.util.Arrays;
import java.util.stream.Collectors;

public class WordsCountUsingStream {
    public static void main(String[] args) {
        String str= "Java streams are powerful and Java streams are flexible";
        Arrays.stream(str.split("\\s+")).collect(Collectors.groupingBy(w-> w,Collectors.counting())).forEach((word,count)-> System.out.println(word+" "+count));


    }
}
