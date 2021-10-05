import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = -1;

        while(op != 0){

            System.out.print("Ingrese el dia de la semana: ");
            int dia = sc.nextInt();
            System.out.println(diaSemana(dia));
            System.out.println(diaSemanaIfElse(dia));

            System.out.println("Desea continuar? <1-Si//0-No>");
            op = sc.nextInt();
        }
        System.out.println("Hasta pronto!!");
        sc.close();
    
    }

    public static String diaSemana(int dia){
        String semana = null;

        switch(dia){
            case 1:
                semana = "Domingo";
                break;
            case 2:
                semana = "Lunes";
               break;
            case 3:
                semana = "Martes";
               break;
            case 4:
                semana = "Miercoles";
               break;
            case 5:
                semana = "Jueves";
               break;
            case 6:
                semana = "Viernes";
               break;
            case 7:
                semana = "Sabado";
               break;
            default:
                semana = "Fuera de rango";
                break;
        }
        return semana;
    }

    public static String diaSemanaIfElse(int dia){
        String semana = null;
        
        if(dia == 1){
            semana = "Domingo";
        }else if(dia == 2){
            semana = "Lunes";
        }else if(dia == 3){
            semana = "Martes";
        }else if(dia == 4){
            semana = "Miercoles";
        }else if(dia == 5){
            semana = "Jueves";
        }else if(dia == 6){
            semana = "Viernes";
        }else if(dia == 7){
            semana = "Sabado";
        }else if(dia < 1 || dia > 7){
            semana = "Fuera de rango";
        }
        
        return semana;
    }
}
