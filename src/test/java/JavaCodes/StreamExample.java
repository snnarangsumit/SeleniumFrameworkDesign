package JavaCodes;
import java.util.Arrays;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("apple", "banana", "cherry", "date");

        boolean anyStartsWithA = myList.stream().anyMatch(s -> s.startsWith("a"));

        System.out.println("Any element starts with 'a': " + anyStartsWithA);
    }
}
