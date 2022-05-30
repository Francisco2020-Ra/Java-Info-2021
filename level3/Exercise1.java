package level3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
public class Exercise1 {

    public static void main(String[] args) {
        filter(list());
    }
    private static ArrayList<String> list(){
        ArrayList<String> listOfWords = new ArrayList<>();
        listOfWords.add("Hello");
        listOfWords.add("");
        listOfWords.add(null);
        listOfWords.add("Informatorio");

        return listOfWords;
    }
    private static void filter(ArrayList<String> words){
        List<String> newWordList = words.stream()
            .filter(Objects::nonNull)
            .filter(Exercise1::compareEmpty)
            .collect(Collectors.toList());

        newWordList.forEach(System.out::println);
    }
    private static boolean compareEmpty(String value){
        return !"".equals(value);
    }
 }
