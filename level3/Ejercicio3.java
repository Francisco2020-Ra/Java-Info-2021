package level3;
/*
Se dispone de una lista de Strings,de la cual saber la cantidad de valores
que comiencen con la letra B (tanto mayúscula como minúscula, en ese
caso decimos que será ignoreCase).
*/

import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio3 {

    public static void main(String[] args) {
        imprimirCantidad(
            crearLista()
        );

    }

    public static List<String> crearLista(){
        return List.of("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "brainiac");
    }

    public static void imprimirCantidad(List<String> lista){

        List<String> palabras =lista.stream()
                .map(String::toLowerCase)
                //.peek(n -> System.out.println(n))
                .filter(palabra -> palabra.startsWith("b"))
                .collect(Collectors.toList());

        System.out.println(palabras.size());
    }
}
