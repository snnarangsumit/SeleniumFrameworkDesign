package JavaCodes;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//Stream Creation		
		List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");

		// Stream from a Collection
		Stream<String> stream = myList.stream();

		// Stream from an Array
		String[] myArray = {"a1", "a2", "b1", "c2", "c1"};
		Stream<String> streamFromArray = Arrays.stream(myArray);

//Intermediate Operations
		Stream<String> filteredStream = stream.filter(s -> s.startsWith("c"));
		Stream<String> mappedStream = stream.map(String::toUpperCase);


//Terminal Operations
		long count = stream.count();
		List<String> resultList = stream.collect(Collectors.toList());

//Parallel Streams:
		Stream<String> parallelStream = myList.parallelStream();


//Short-Circuiting Operations:
		boolean anyMatch = myList.stream().anyMatch(s -> s.startsWith("a"));

		
		

	}

}

/*
 * 
 * 
 * stream() : Java Streams are a powerful addition to the Java programming language, introduced in Java 8.
 * They provide a concise and functional approach to processing collections of data
 * 
 * filter(Predicate<T> predicate): Returns a stream consisting of elements that match the given predicate.
 * map(Function<T, R> mapper): Returns a stream consisting of the results of applying the given function to the elements of the stream.
 * sorted(): Returns a stream sorted according to the natural order of the elements.
 * distinct(): Returns a stream consisting of the distinct elements of the stream.
 * 
 * stream().filter
 * he filter operation is an intermediate operation that is used to filter elements based on a given predicate. It returns a new stream consisting of the elements that satisfy the specified condition.
 * 
 * stream().anyMatch
 * In Java Streams, the anyMatch operation is a terminal operation that checks whether any elements of the stream match a given predicate. It returns a boolean indicating whether at least one element of the stream satisfies the provided condition.
 * 
 * 
 * 
 * anyMatch, allMatch, and findFirst.
 * parallel()
 * parallel(), map(Function<T, R> mapper)
 * sorted()
 * distinct()
 * */
