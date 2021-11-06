package level2;

import java.util.*;


public class Ejercicio7 {
    private static Scanner sc = new Scanner(System.in);
    private static List<String> cadena = null;
    
    public static void main(String[] args) {
        cadena = new ArrayList<String>();
        System.out.print("Ingrese el primer valor: ");
        int valor1 = sc.nextInt();
        System.out.print("Ingrese el segundo valor: ");
        int valor2 = sc.nextInt();
        
        fizzBuzzFuncion(valor1, valor2);
        
    }

    public static void fizzBuzzFuncion(int valor1, int valor2){
        int c = 0;
        for(int i = valor1; i<valor2; i++){
            
            if(i%2==0 && i%3==0){
                cadena.add(c++, "FizzBuzz");
            }else if(i%2==0){
                cadena.add(c++, "Fizz");
            }else if(i%3==0){
                cadena.add(c++, "Buzz");
            }else{
                cadena.add(c++, String.valueOf(i));
            }
        }

        System.out.println(cadena);
    }
}
