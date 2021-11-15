package level3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Ejercicio1 {

    private static String nulo = null;
    public static void main(String[] args) {

        ArrayList<String> palabras = new ArrayList<>();
        palabras.add("Hola");
        palabras.add(" ");
        palabras.add(null);
        palabras.add("Informatorio");


        List<String> nuevasPalabras = palabras.stream()
                .filter(Objects::nonNull)
                .filter(n -> !Objects.equals(n, " "))
                .collect(Collectors.toList());

        nuevasPalabras.forEach(System.out::println);
    }
}
