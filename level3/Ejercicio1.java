package level3;

import java.util.*;
import java.util.stream.Collectors;

public class Ejercicio1 {

    public static void main(String[] args) {
        filtrar(lista());
    }

    public static ArrayList<String> lista (){
        ArrayList<String> palabras = new ArrayList<>();
        palabras.add("Hola");
        palabras.add(" ");
        palabras.add(null);
        palabras.add("Informatorio");

        return palabras;
    }

    public static void filtrar(ArrayList<String> palabras){
        List<String> nuevasPalabras = palabras.stream()
            .filter(Objects::nonNull)
            .filter(n -> !Objects.equals(n, " "))
            .collect(Collectors.toList());

        nuevasPalabras.forEach(System.out::println);
    }
}
