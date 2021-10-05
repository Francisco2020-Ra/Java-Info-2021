import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        
        tablaMultiplicar();    
    }

    public static void tablaMultiplicar(){
        Scanner sc = new Scanner(System.in);
        int op = -1;

        while(op != 0){
            System.out.print("Ingrese un valor: ");
            int valor = sc.nextInt();
            
            for(int i=1; i <= 10; i++){
                System.out.println(valor + " * " + i + " = " + valor*i);
            }

            System.out.print("Desea igresar otro valor? <1-Si//0-No>:  ");
            op = sc.nextInt();
        }
        System.out.println("Hasta pronto!!");
        sc.close();    
    }
    
    
}
