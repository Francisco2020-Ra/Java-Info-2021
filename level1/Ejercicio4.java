package level1;

import java.util.Scanner;

public class Ejercicio4 {
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int op = -1;

        while(op != 0){
            System.out.print("Ingrese un valor: ");
            int valor = sc.nextInt();

            factorizar(valor);

            System.out.print("Desea volver a ingresar? <1-Si//0-No>: ");
            op = sc.nextInt();
        }
        System.out.println("Hasta pronto!!");
        sc.close();
    }

    public static void factorizar(int valor){

        int b = valor;

        for (int i = 1; i <= valor-1; i++){
            b = b * i;
        }
        System.out.println("El factorial es: " + b);
    }
    
}
