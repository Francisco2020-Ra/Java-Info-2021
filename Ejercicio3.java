import java.util.Scanner;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 1;

        while(op != 0){
            System.out.print("Ingrese la nota: ");
            int nota = sc.nextInt();  

            System.out.println(obtenerNota(nota));

            System.out.println("Desea continuar? <1-Si//0-No>");
            op = sc.nextInt();
        }

        System.out.println("Hasta pronto!!");
        sc.close();
    }

    public static String obtenerNota(int nota){
        String calificacion = null;

        if(nota < 0 || nota > 100){
            calificacion = "Fuera de rango";
        }else if(nota<=59){
            calificacion = "Desaprobado";
        }else if(nota<=74){
            calificacion = "Bueno";
        }else if(nota <= 84){
            calificacion = "Distinguido";
        }else if(nota <= 92){
            calificacion = "Sobresaliente";
        }else if(nota <= 100){
            calificacion = "Excelente";
        }

        return calificacion;
    }
}
