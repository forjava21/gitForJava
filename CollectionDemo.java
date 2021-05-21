import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionDemo {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("apple", "cherry", "pear");
		names.forEach(System.out::println);
		
		List<String> list = new ArrayList<>();
		list.add("red");
		list.add("blue");
		list.forEach(System.out::println);
		

	}

}

