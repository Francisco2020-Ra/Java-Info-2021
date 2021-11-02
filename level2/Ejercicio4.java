package level2;
//Cargar un arrayList con 12 nombres de estudiantes (String),
//luego separarlos en 3 cursos (3 arrayList) e imprimir dichos cursos.

import java.util.*;

public class Ejercicio4{
    private static List<String> estudiantes = new ArrayList<String>();
    private static List<String> curso1 = new ArrayList<String>();
    private static List<String> curso2 = new ArrayList<String>();
    private static List<String> curso3 = new ArrayList<String>();
    public static void main(String[] args) {
     
        estudiantes.add("Carlos");
        estudiantes.add("Fernando");
        estudiantes.add("Alejandro");
        estudiantes.add("Camilo");
        estudiantes.add("Fernanda");
        estudiantes.add("Maria");
        estudiantes.add("Adrea");
        estudiantes.add("Carolina");
        estudiantes.add("Yamila");
        estudiantes.add("Lucas");
        estudiantes.add("Lucio");
        estudiantes.add("Latan");
        
        curso1 = estudiantes.subList(0, 3);
        curso2 = estudiantes.subList(4, 7);
        curso3 = estudiantes.subList(8, 11);

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(curso3);

    }
}