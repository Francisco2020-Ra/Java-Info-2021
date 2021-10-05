import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main(String[] args) {

        imprimirNumero();

    }

    public static void imprimirNumero(){
        
        Scanner sc = new Scanner(System.in);
        int op = 1;

        while(op != 0){
            System.out.println("Ingrese tres numero enteros");
            int valor1 = sc.nextInt();
            int valor2 = sc.nextInt();
            int valor3 = sc.nextInt();

            System.out.println("El primera nro ingresado es: " + valor1);
            System.out.println("El segundo nro ingresado es: " + valor2);
            System.out.println("El tercer nro ingresado es: " + valor3);

            System.out.println("Desea continuar? <1-Si//0-No>");
            op = sc.nextInt();
        }    
        System.out.println("Hasta pronto!!");
        sc.close();
    }
}
