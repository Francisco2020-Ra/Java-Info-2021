package level3;

import java.util.*;
import java.util.stream.*;

/*
Se dispone de una lista de Integer, de la cual
queremos obtener otra lista aplicando la operación
de factorial pero no se desean valores repetidos.
*/
public class Ejercicio4 {

    private static List<Integer> palabras = List.of(1, 2, 4, 4, 4, 5, 5);

    public static void main(String[] args) {

        factorialStreams(filtrarLista(palabras)).forEach(System.out::println);
    }

    /*Funcion para filtrar las lista de objetos de tipo enteros*/
    public static List<Integer> filtrarLista(List<Integer> palabras){
        return palabras.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    /*Funcion para sacar factorial de la lista de objtos de tipo Integer*/
    public static List<Integer> factorialStreams(List<Integer> n) {
         List<Integer> lista = new ArrayList<>() {};

         for(Integer r : n) {
             lista.add((int) LongStream.rangeClosed(2, r).reduce(1, (long x, long y) -> x * y));
         }
         return lista;
    }
}


