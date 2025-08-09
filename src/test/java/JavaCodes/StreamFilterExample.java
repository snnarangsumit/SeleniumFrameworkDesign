package JavaCodes;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Using stream filter to get only even numbers
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Original numbers: " + numbers);
        System.out.println("Even numbers: " + evenNumbers);
    }
}


/*
Stream<T> filter(Predicate<? super T> predicate)

The filter method is used to create a new stream containing only the elements that are even (n % 2 == 0). 

The resulting stream is then collected into a list using the collect method.

Predicate is a functional interface that represents a predicate (a boolean-valued function) of one argument.

*/