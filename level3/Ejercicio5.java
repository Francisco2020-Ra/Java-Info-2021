package level3;

import java.time.*;
import java.util.*;

/*
Se posee una Lista con objetos de clase Alumno con los atributos: apellido, nombre y fechaDeNacimiento
(con tipos: String, String y LocalDate). Se desea generar un Map<String, Integer> donde
la clave de Map será el apellido concatenado con el nombre (con separador de espacio en blanco) y
el value la edad del alumno.
La lista de entrada debe estar cargada con varios alumnos (al menos 5) para subir el ejemplo y demostrar
su funcionamiento.
*/
public class Ejercicio5 {

    private static String clave;
    private static Integer valor;
    private static Map<String, Integer> nMap = new HashMap<>();

    public static void main(String[] args) {

        cargarMap(cargarLista());
    }

    //Funcion que cargaMap e imprime en consola
    public static void cargarMap(List<Alumno> alumnos){
        for (Alumno fn : alumnos) {
            clave = fn.getNombre() + " " + fn.getApellido();
            valor = LocalDate.now().getYear() - fn.getFechaDeNacimiento().getYear();
            nMap.put(clave, valor);
        }
        System.out.println(nMap);
    }

    //Funcion que carga Lista de alumnos
    public static List<Alumno> cargarLista(){
        return List.of(
                new Alumno("Homero", "Simpson", LocalDate.parse("1990-02-10")),
                new Alumno("Diego", "Salta", LocalDate.parse("1990-03-16")),
                new Alumno("Marcela", "Moreno", LocalDate.parse("1989-04-17")),
                new Alumno("Jorge", "Jaralungui", LocalDate.parse("1953-05-18")),
                new Alumno("Juan", "Quinteros", LocalDate.parse("1998-04-30"))
        );
    }
}

/* -----Clase Alumno ------*/
class Alumno{
    String nombre;
    String apellido;
    LocalDate fechaDeNacimiento;

    public Alumno(String nombre, String apellido, LocalDate fechaDeNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaDeNacimiento=" + fechaDeNacimiento +
                '}';
    }
}
