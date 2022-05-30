package level3;

import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class Exercise4 {
    private static List<Integer> listNumbers = List.of(1, 2, 4, 4, 4, 5, 5);

    public static void main(String[] args) {
        getFactorialStreams(filterDistinctNumbers(listNumbers));
    }
    public static List<Integer> filterDistinctNumbers(List<Integer> numbers) {
        return numbers.stream()
                .distinct()
                .collect(toList());
    }
    public static void getFactorialStreams(List<Integer> n) {
        n.stream()
                .map(r -> calculate_factorial(r))
                .collect(toList())
                .forEach(System.out::println);
    }
    private static int calculate_factorial(int value) {
        return IntStream.rangeClosed(2, value).reduce(1, (x, y) -> x * y);
    }
}


