package level3;

import java.util.List;
import java.util.stream.Collectors;

public class Exercise3 {

    public static void main(String[] args) {
        printTotalWordsStartingWithB(createList());
    }
    public static List<String> createList() {
        return List.of("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "brainiac");
    }
    public static void printTotalWordsStartingWithB(List<String> list) {
        System.out.println(
                list.stream()
                        .map(String::toLowerCase)
                        .filter(palabra -> palabra.startsWith("b"))
                        .collect(Collectors.toList())
                        .size());
    }
}
