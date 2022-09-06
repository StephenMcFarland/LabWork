package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//import java.util.Stream;
import java.util.stream.Stream;
import java.util.Collections;


public class LabStreams {

	public static void main(String[] args) {


	

				
				//Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
				//stream.forEach(p -> System.out.println(p));
				
//				List<Integer> stream = List.of(1,2,3,4,5,6,7,8,9);
//				stream.forEach(p -> System.out.println(p));
				
//				List<Integer> randomNumbers = List.generate(() -> (new Random()).nextInt(100));
		//
//					randomNumbers.limit(20).forEach(System.out::println);
					
					
					
					
//					List<Integer> list = new ArrayList<Integer>();
//					 
//					for(int i = 1; i< 10; i++){
//					      list.add(i);
//					}
		//
//					List<Integer> stream2 = new ArrayList<Integer>();//list.stream();
//					List<Integer> evenNumbersList = stream2.filter(i -> i%2 == 0)
//					                                    .collect(Collectors.toList());
//					System.out.print(evenNumbersList);
				//List<Integer> numbers = new ArrayList<>(Arrays.asList(0,2,-1,5,6,-2,9,-4,-2));
				int[] numbers = {0,2,-1,5,6,-2,9,-4,-2};
				Integer[] numbersArr = {0,2,-1,5,6,-2,9,-4,-2};
				System.out.println(Arrays.toString(numbers));
				Arrays.sort(numbersArr,2,6);
				System.out.println("Array Sorted Range:  " + Arrays.toString(numbersArr));
					//numbers.stream().filter()
					
					Arrays.sort(numbers);
					System.out.println("Array sorted:  " + Arrays.toString(numbers));
					Arrays.sort(numbersArr, Collections.reverseOrder());
					System.out.println("Array Reversed:  " + Arrays.toString(numbersArr));
					
					
					Stream<Integer> numStream = Stream.of(1,3,5,4,2);

				numStream.sorted()
						 .forEach(System.out::print);
					
					
					System.out.println();
					
					List<String> memberNames = new ArrayList<>();
					memberNames.add("Amitabh");
					memberNames.add("Shekhar");
					memberNames.add("Aman");
					memberNames.add("Rahul");
					memberNames.add("Shahrukh");
					memberNames.add("Salman");
					memberNames.add("Yana");
					memberNames.add("Lokesh");
					
					memberNames.stream().sorted()
		            .map(String::toLowerCase)
		            .forEach(System.out::println);
					System.out.println();
					
					memberNames.stream().filter((s) -> s.startsWith("A"))
		            .forEach(System.out::println);
					System.out.println();
					
					memberNames.stream().filter((s) -> s.startsWith("A"))
		            .map(String::toUpperCase)
		            .forEach(System.out::println);
					System.out.println();
					
					memberNames.stream().filter((s) -> s.length()<6)
		            .forEach(System.out::println);
					
				System.out.println();
					
					memberNames.stream().filter((s) -> s.length()>6)
		            .forEach(System.out::println);
					
				System.out.println();
					
					memberNames.stream().filter((s) -> s.length()==6)
		            .forEach(System.out::println);
			}




	}


