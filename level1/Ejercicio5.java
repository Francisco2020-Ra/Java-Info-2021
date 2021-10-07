package level1;

import java.util.Scanner;

/**
 * Ejercicio5
 */
public class Ejercicio5 {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int op = -1;

        while(op != 0){
            System.out.print("Ingrese el primer valor: ");
            int valor1 = sc.nextInt();
            System.out.print("Ingrese el segundo valor: ");
            int valor2 = sc.nextInt();

            sumar(valor1, valor2);

            System.out.print("Desea continuar? <1-Si//0-No>: ");
            op = sc.nextInt();
        }

        System.out.println("Hasta pronto!!");
        sc.close();
    }

    public static void sumar(int valor1, int valor2){
        int valor3 = 0;

        for(int i = 1; i <= valor2; i++){
            valor3 = valor3 + valor1;
        }

        System.out.println( valor1 + " * " + valor2 + " = " + valor3);


    }
}