package Assignment4;

import java.util.Optional;
import java.util.stream.Stream;

public class Day4Assignment {
	public static void main(String[] args) {

		// 1. Take a data that contains food, and try to do the following operations

		Stream<String> foodStream = Stream.of("Pizza", "Hotdog", "pasta", "Burger", "vadaPav");

		// 1.findAny
		Optional<String> result = foodStream.filter(name -> Character.isLowerCase(name.charAt(0))).findAny();
		System.out.println(result.get());

		// 2.findfirst

		Stream<String> foodStream1 = Stream.of("Pizza", "Hotdog", "pasta", "Burger", "vadaPav");
		Optional<String> result1 = foodStream1.filter(name -> Character.isLowerCase(name.charAt(0))).findFirst();
		System.out.println(result1);

		// 3.anymatch
		Stream<String> foodStream2 = Stream.of("pizza", "hotdog", "pasta", "burger", "vadaPav");
		boolean result2 = foodStream2.anyMatch(name -> Character.isUpperCase(name.charAt(0)));

		System.out.println(result2);

		// 4.allmatch

		Stream<String> foodStream3 = Stream.of("Pizza", "Hotdog", "Pasta", "Burger", "VadaPav");
		boolean result3 = foodStream3.allMatch(name -> Character.isUpperCase(name.charAt(0)));

		System.out.println(result3);

		// 5.nonematch

		Stream<String> foodStream4 = Stream.of("pizza", "Hotdog", "pasta", "burger", "vadaPav");
		boolean result4 = foodStream4.noneMatch(name -> Character.isUpperCase(name.charAt(0)));

		System.out.println(result4);
		

	}

}
