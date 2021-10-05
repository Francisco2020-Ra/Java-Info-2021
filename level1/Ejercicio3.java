package level1;

import java.util.Scanner;

public class Ejercicio3 {
    
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
        
        System.out.println("Hasta pronto!!!");
        sc.close();
    }    

    public static void factorizar(int valor){

        for(int i = 1; i <= valor; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
