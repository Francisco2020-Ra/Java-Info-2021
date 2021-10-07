package level1;

import java.util.Scanner;

public class Ejercicio8 {
    private static Scanner sc = new Scanner(System.in);
    private static int op = -1;

    public static void main(String[] args) {
        imprimir();
    }

    public static void imprimir(){
     
        while(op != 0){

            System.out.print("Nombre y Apellido: ");
            String nombre = sc.nextLine();
            System.out.print("Edad: ");
            int edad = sc.nextInt();
            sc.nextLine();
            System.out.print("Direccion: ");
            String direccion = sc.nextLine();
            System.out.print("Ciudad: ");
            String ciudad = sc.nextLine();

            System.out.println(ciudad +" - "+ direccion +" - "+ edad +" - "+ nombre);

            System.out.print("Volver a ingresar? <1-Si//0-No>: ");
            op = sc.nextInt();
            sc.nextLine();
        }

        System.out.println("Hasta pronto!!!");
        sc.close();
    }

}
