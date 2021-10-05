package level1;

import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese dos valore enteros: ");
        int valor1 = sc.nextInt();
        int valor2 = sc.nextInt();
        sc.close();
    
        operaciones(valor1, valor2);
    
    
    }

    public static void operaciones(int valor1, int valor2){

        sumar(valor1,valor2);
        restar(valor1,valor2);
        multiplicar(valor1, valor2);
        dividir(valor1, valor2);
        mod(valor1, valor2);
    }    
        
    public static void sumar(int valor1, int valor2){
        int suma = valor1 + valor2;
        System.out.println("El valor de la suma es: " + suma);

    }

    public static void restar(int valor1, int valor2){
        int resta = valor1 - valor2;
        System.out.println("El valor de la resta es: " + resta);
    }

    public static void multiplicar(int valor1, int valor2){
        int resultado = valor1 * valor2;
        System.out.println("El valor de la multiplicacion es: " + resultado);
    }

    public static void dividir(int valor1, int valor2){
        if(valor2 != 0){
            int divide = valor1 / valor2;
            System.out.println("El valor de la division es: " + divide);
        }else{
            System.out.println("El segundo valor debe ser diferente de cero");
        }
    }

    public static void mod(int valor1, int valor2){
        if(valor2 != 0){
            int resultado = valor1 % valor2;
            System.out.println("El valor mod es: " + resultado);
        }else{
            System.out.println("El segundo valor debe ser diferente de cero");
        }    
    }
}
