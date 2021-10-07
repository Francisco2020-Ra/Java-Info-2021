package level1;

import java.util.Scanner;

public class Ejercicio9 {
    
    private static Scanner sc = new Scanner(System.in);
    private static int op = -1;

    public static void main(String[] args) {
        
        calcularLetra();

    }

    public static void calcularLetra(){
        int contador = 0;
        while(op != 0){
            System.out.println("Ingrese una palabra, texto o frase: ");
            String dato = sc.nextLine();
            System.out.print("Que letra desea contar?: ");
            char a = sc.next().charAt(0);

            for(int i = 0; i<dato.length(); i++){
                if(dato.charAt(i) == a){
                    contador++;
                }
            }
            System.out.println("La letra " + a + " se repite " + contador + " veces ");
            contador = 0;
            System.out.print("Desea volver a ingresar? <1-Si//0-No>: ");
            op = sc.nextInt();
            sc.nextLine();
        }
        System.out.println("Hasta pronto!!");
        sc.close();
    }
    
}
