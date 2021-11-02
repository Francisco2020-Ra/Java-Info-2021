package level2;

import java.util.*;

public class Ejercicio2 {
    
    private static final Scanner sc = new Scanner(System.in);
    private static int op = -1;
    private static List<Integer>  lista = new ArrayList<Integer>();
    public static void main(String[] args) {
        
        agregarNumero();
        
    }

    public static void agregarNumero() {
        int contador = 5;
        while(op != 0){
           
            try{
                System.out.println("Agregar cinco numero enteros: ");
                
                for(int i = 1; i<=contador; i++ ){
                    
                    System.out.print("Valor #"+i+": ");    
                    int valor = sc.nextInt();

                    lista.add(valor);
                }
                
                System.out.println("Muy bien!! Cotinuemos...");
                System.out.print("Agrega un valor al principio de la lista: ");
                int valor = sc.nextInt();
                lista.add(0, valor);

                System.out.println("\nPerfecto!! Solo queda un paso mas..");
                System.out.print("Agrega un valor al final de la lista: ");
                int valor2 = sc.nextInt();
                lista.add(valor2);

                System.out.println("\t\t\nSu lista: ");
                for(Integer lis : lista){
                    System.out.print(lis);
                }
                System.out.print("\nTamaño de la lista antes de agregar: " + (lista.size()-2));
                System.out.print("\nTamaño de la lista actual: " + lista.size());
                
                System.out.print("\nDesea continuar?<1-Si//0-No>: ");
                op = sc.nextInt();
                lista.clear();

            }catch(Exception e){
                System.out.println("Solo numero enteros!!");
                System.out.println("Vuelve a intentarlo....");
                lista.clear();
                sc.nextLine();
                agregarNumero();
            }finally{
                sc.close();
            }           
        }
    }
    
}
