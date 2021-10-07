package level1;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = -1;

        while(op != 0){
            System.out.print("Ingrese el valor #1: ");
            int valor1 = sc.nextInt();
            System.out.print("Ingrese el valor #2: ");
            int valor2 = sc.nextInt();

            potenciar(valor1, valor2);

            System.out.print("Desea continuar? <1-Si//0-No>: ");
            op = sc.nextInt();
        }    
        System.out.println("Hasta pronto!!");
        sc.close();
    }


    public static void potenciar(int valor1, int valor2){
        int valor3 = valor1;

        for(int i = 1; i < valor2; i++){
            valor3 = valor3 * valor1;
        }
        String mensaje = valor1 + " elevado a " + valor2 + " = " + valor3;
        String a = "-";

        System.out.println(
            a.repeat(mensaje.length()) 
            + "\n" + mensaje
            + "\n"
            + a.repeat(mensaje.length())
        );
    }
}
