package level2;

import java.util.*;

/*Crear una lista que contenga como elementos 
la numeración de cartas de una baraja francesa 
(solo los valores, no figuras). 
Se deberá cargar el ArrayList (en orden), 
imprimir, 
imprimir en orden inverso (reverse), 
desordenar (mezclar) el arrayList 
y volver a imprimir.
**/

public class Ejercicio3 {
    private static final Scanner sc = new Scanner(System.in);
    private static int op = -1;
    private static List<Integer> lista = new ArrayList<Integer>();

    public static void main(String[] args) {

        menu();
        
    }

    public static void menu(){
        System.out.println("Bienvenido!!!");
        System.out.println("Por favor ingrese una opcion");
        System.out.println("Recuerde que para iniciar primero debera cargar las barajas!!");

        while(op != 0){
            System.out.println("1-Cargar barajas"
                    +"\n2-Mostrar\n"
                    +"3-Mostrar inverso\n"
                    +"4-Mezclar\n"
                    +"0-Salir");
            op = sc.nextInt();
            
            switch (op) {
                case 1:
                    cargar();    
                    break;
                case 2:
                    imprimir();
                    break;
                case 3:
                    imprimirInverso();
                    break;
                case 4:
                    mezclar();
                    break; 
                case 0:
                    op = 0;
                    break;           
                default:
                    System.out.println("Opcion no valida...");
                    break;
            }


        }
    }    

    public static void cargar(){

        for(int i = 2; i<=9;i++){
            lista.add(i);
        }
        System.out.println("Lista cargada con exito!!Continuemos..."); 
    }
    public static void imprimir(){
        System.out.println("Lista de cartas");
        for(Integer valor : lista){
            System.out.println(valor);
        }
    }
    public static void imprimirInverso(){ 
        Collections.reverse(lista);
        System.out.println(lista);  

    }
    public static void mezclar(){
        
        Collections.shuffle(lista);

        for (Integer lis: lista) {
            System.out.println(lis);
        }
    }
    
}

