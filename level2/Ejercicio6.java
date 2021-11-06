package level2;

import java.util.*;

public class Ejercicio6 {

    private static Set<Empleado> lista = new HashSet<Empleado>();
    private static Map<Integer, Integer> sueldoCalculado = new HashMap<Integer, Integer>(); 
    public static void main(String[] args) {
        
        Empleado em1 = new Empleado("Francisco", "Romero", 34599433, 5, 650);
        Empleado em2 = new Empleado("Francisco", "Romero", 34599434, 5, 750);
        Empleado em3 = new Empleado("Francisco", "Romero", 34599436, 5, 150);
        Empleado em4 = new Empleado("Francisco", "Romero", 34599437, 5, 250);
        Empleado em5 = new Empleado("Francisco", "Romero", 34599438, 5, 350);
        Empleado em6 = new Empleado("Francisco", "Romero", 34599439, 5, 450);
        Empleado em7 = new Empleado("Francisco", "Romero", 34599431, 5, 550);

        lista.add(em1);
        lista.add(em2);
        lista.add(em3);
        lista.add(em4);
        lista.add(em5);
        lista.add(em6);
        lista.add(em7);

        for(Empleado emp : lista){
            sueldoCalculado.put(emp.getDni(), emp.getHorasTrabajadas()*emp.getValorPorHora());
        }

        for(Map.Entry<Integer, Integer> lista : sueldoCalculado.entrySet()){
            System.out.println("DNI: " + lista.getKey() + ", Sueldo Calculado: " + lista.getValue());
        }

       //sueldoCalculado.forEach((k, v) -> System.out.println("DNi: " + k + ", Sueldo Calculado: " + v));
    }    
}

class Empleado{

    private String nombre;
    private String apellido;
    private int dni;
    private int horasTrabajadas;
    private int valorPorHora;

    public Empleado(String nombre, String apellido, int dni, int horasTrabajadas,
                    int valorPorHora){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.horasTrabajadas = horasTrabajadas;
        this.valorPorHora = valorPorHora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(int valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    @Override
    public String toString() {
        return this.nombre +" "+ this.apellido 
        +", "+ this.dni +", "+ this.horasTrabajadas
        +", "+ this.valorPorHora;
    }
}
