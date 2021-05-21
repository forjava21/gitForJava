import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreamdemo {

	public static void main(String[] args) throws IOException {
		
		//1. IntegerStream
		IntStream
			.range(1,  10)
			.forEach(System.out::print);
		System.out.println();
		//2. IntegerStream with skip statement
		IntStream
			.range(1,  10)
			.skip(5)
			//.forEach(System.out::print)
			.forEach(x -> System.out.println(x));
				
		//3. sum function
		System.out.println(
		IntStream
			.range(1, 6)
			.sum());
		//4. Stream.of sorted and findfirst
		Stream.of("banana", "apple", "berry","pear")
			.sorted()
			.findFirst()
			.ifPresent(System.out::println);
		
		//5. Stream from Array, sort, filter and print
		String[] str = {"banana", "apple", "berry","pear", "orange"};	
		Arrays.stream(str)
			.filter(x -> x.startsWith("b"))
			.forEach(System.out::println);
		
		//6. squares of an int
		Arrays.stream(new int[] {2, 4, 6, 8, 10})
			.map(x -> x * x)
			//.average()
			//.ifPresent(System.out::println);
			.forEach(System.out::println);
		
		//7. Stream from list
		List<String> fruits = Arrays.asList("banana", "apple", "berry","pear", "orange", "plum");
		fruits
			.stream()
			.map(String::toUpperCase)
			.filter(x -> x.startsWith("P"))
			.forEach(System.out::println);
		
		//8. Stream rows from text files, sort, filter and print
		Stream<String> bands = Files.lines(Paths.get("\\Users\\bharg\\OneDrive\\Desktop\\bands.txt"));
		bands
			.sorted()
			.filter(x -> x.length() > 12)
			.forEach(System.out::println);
		bands.close();
		
		//9. Stream rows from text file and save to list
				Stream<String> bands = Files.lines(Paths.get("\\Users\\bharg\\OneDrive\\Desktop\\bands.txt"));

	}

}
