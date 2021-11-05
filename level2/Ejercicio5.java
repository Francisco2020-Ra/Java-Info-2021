package level2;

import java.util.*;

/*Dados 2 ArrayList que contienen horas-trabajadas (array1) 
y valor-por-hora(array2) del resumen de carga de horas semanal de un empleado. 
Se debe generar otra lista que contenga los totales 
y luego imprimir el total final a cobrar.
[6, 7, 8, 4, 5]
[350, 345, 550, 600, 320]

## Los arrays son iguales y corresponden a los días trabajados de una semana Lun-Vie.
**/

public class Ejercicio5 {

    private static List<Integer> horasT = new ArrayList<Integer>();
    private static List<Integer> valorH = new ArrayList<Integer>();
    private static List<Integer> total = new ArrayList<Integer>();

    public static void main(String[] args) {
    horasT.add(6);
    horasT.add(7);
    horasT.add(8);
    horasT.add(4);
    horasT.add(5);

    valorH.add(350);
    valorH.add(345);
    valorH.add(550);
    valorH.add(600);
    valorH.add(320);
    Integer totalCobrar = 0;

    for(int i = 0; i<=horasT.size()-1;i++){
        total.add(i, horasT.get(i)*valorH.get(i));
        totalCobrar = totalCobrar + total.get(i); 
    }    

    System.out.println(total);
    System.out.println("Total Final: $ " + totalCobrar);

    }
    
}
