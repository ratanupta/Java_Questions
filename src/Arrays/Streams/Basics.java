package Arrays.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
    A Stream is used to process data from a source such as:List
Set
Array
Map
other collections
 */
public class Basics {
    public static void main(String[] args) {
        // Create a stream from an array
        int[] numbers = {1, 2, 3, 4, 5 , 6 ,7,7,8,9,10};
        int sum = java.util.Arrays.stream(numbers).sum();
        System.out.println("Sum of numbers: " + sum);

        // Create a stream from a list
        java.util.List<String> names = java.util.Arrays.asList("Alice", "Bob", "Charlie");
        long count = names.stream().count();
        System.out.println("Count of names: " + count);

        // Create a stream from a set
        java.util.Set<Integer> uniqueNumbers = new java.util.HashSet<>(java.util.Arrays.asList(1, 2, 2, 3, 4));
        uniqueNumbers.stream().forEach(System.out::println);

        //even numbers
        List<Integer> evenNumbersSquare = Arrays.stream(numbers).filter(n -> n % 2 == 0).map( n -> n*n).boxed().toList();
        System.out.print("Even numbers: " + evenNumbersSquare);

        int sumOfEvenNumbers = Arrays.stream(numbers).filter(n -> n%2 == 0).sum();
        System.out.println("\nSum of even numbers: " + sumOfEvenNumbers);


    }
}
