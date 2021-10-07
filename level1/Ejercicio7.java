package level1;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = -1;

        while(op != 0){
            
            System.out.print("Ingrese una palabra: ");
            String palabra = sc.nextLine();   

            convertirMayuscula(palabra);
           
            System.out.print("Desea volver a ingresar? <1-Si//0-No>: ");
            op = sc.nextInt();
            sc.nextLine();
            
        }
        System.out.println("Hasta pronto!!");
        sc.close();
    }

    public static void convertirMayuscula(String palabra){ 
         
        String nuevaPalabra = new String();
        int op = 0;

        for(int i = 0; i < palabra.length(); i++){ 
            switch (palabra.charAt(i)) {
                case 'a':
                    nuevaPalabra += "A";   
                    break;
                case 'b':
                    nuevaPalabra += "B";
                    break;
                case 'c':
                    nuevaPalabra += "C";
                    break;
                case 'd': 
                    nuevaPalabra += "D";   
                    break;
                case'e':
                    nuevaPalabra += "E";   
                    break;
                case'f':
                    nuevaPalabra += "F";   
                    break;
                case'g':
                    nuevaPalabra += "G";   
                    break;
                case'h':
                    nuevaPalabra += "H";   
                    break;
                case'i':
                    nuevaPalabra += "I";   
                    break;
                case'j':
                    nuevaPalabra += "J";   
                    break;
                case'k':
                    nuevaPalabra += "K";   
                    break;
                case'l':
                    nuevaPalabra += "L";   
                    break;
                case'm':
                    nuevaPalabra += "M";   
                    break;
                case'n':
                    nuevaPalabra += "N";   
                    break;
                case'ñ':
                    nuevaPalabra += "Ñ";   
                    break;
                case'o':
                    nuevaPalabra += "O";   
                    break;
                case'p':
                    nuevaPalabra += "P";   
                    break;
                case'q':
                    nuevaPalabra += "Q";   
                    break;
                case'r':
                    nuevaPalabra += "R";   
                    break;
                case's':
                    nuevaPalabra += "S";   
                    break;
                case't':
                    nuevaPalabra += "T";   
                    break;
                case'u':
                    nuevaPalabra += "U";   
                    break;
                case'v':
                    nuevaPalabra += "V";   
                    break;
                case'w':
                    nuevaPalabra += "W";   
                    break;
                case'x':
                    nuevaPalabra += "X";
                    break;   
                case'y':
                    nuevaPalabra += "Y";
                        break;  
                case'z':
                    nuevaPalabra += "Z";
                    break; 
                default:  
                    op = 1;   
                    break; 
            }
        }

        if(op == 0){
            System.out.println(nuevaPalabra);   
        }else{
            System.out.println("Solo en minuscula");
        }    
    }    

    
}
