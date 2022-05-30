package level3;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise2 {

    public static void main(String[] args) {
        powerSquared(loadListOfIntegers());
    }
    public static List<Integer> loadListOfIntegers(){
        return Stream
                .iterate(1, n -> n+1)
                .limit(5)
                .collect(Collectors.toList());
    }
    public static void powerSquared(List<Integer> numberInt){
         System.out.println(
                numberInt.stream()
                .map(n -> n*n)
                .collect(Collectors.toList()));
    }
}
