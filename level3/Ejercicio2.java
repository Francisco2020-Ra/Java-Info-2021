package level3;
/*
Dada una lista que contiene números enteros,
se deberá generar otra lista que contendrá
el resultado de aplicar la operación de potencia a 2.
*/
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio2 {

    public static void main(String[] args) {
        potenciaciacion(
                numeroEnteros()
        );
    }

    //Funcion que devuelve una lista de objetos de tipo enteros
    public static List<Integer> numeroEnteros(){
        return List.of(1, 2, 3, 4, 5);
    }

    //Funcion que imprime un objeto de tipo entero elevado a la potencia cuadrada
    public static void potenciaciacion(List<Integer> numeroEnteros){
        List<Integer> potencia = numeroEnteros.stream()
                .map(n -> n*n)
                //.peek(n -> System.out.print(n + ", " ))
                .collect(Collectors.toList());

       potencia.forEach(n -> System.out.print(n +", "));
    }
}
