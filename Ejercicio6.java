import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int op = 1;
        
        while(op != 0){
            System.out.print("Ingrese un valor: ");
            int valor = sc.nextInt();
            
            System.out.println("Valor ingresado: " + valor);

            System.out.println("Desea continuar? <1-SI/0-No>");
            op = sc.nextInt();            
        }
        
        System.out.println("Hast pronto!!");
        sc.close();
    }
}
