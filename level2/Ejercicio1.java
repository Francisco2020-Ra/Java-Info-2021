package level2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1{

    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<String> ciudades = new ArrayList<String>(); 
    private static ArrayList<Integer> contador = new ArrayList<Integer>(); 

    public static void main(String[] args) {
        
        ingresarCiudades();
        sacarRankig();         
    }

    public static void ingresarCiudades(){
        int contar = 1;
        String op = "1";

        while(!op.equals("0")){

            System.out.print("Ingrese la ciudad<0-Salir>: ");
            String a = sc.nextLine();

            if(!a.equals("0")){
                //Recorre la lista ciudades
                for(int i=0; i<=ciudades.size(); i++){
                    
                    //Si no existe el elemento lo agrega en minuscular
                    if(!ciudades.contains(a.toLowerCase())){
                        
                        //Agrega la ciudad a la lista ciudades
                        ciudades.add(a.toLowerCase());

                        //Obtiene el indice donde se agrego la ciudad y en el 
                        //mismo indice pero en la lista contador suma un numero
                        contador.add(ciudades.indexOf(a.toLowerCase()), contar);
                        break;
                    }else{

                        //Si el elemento existe, obtiene el indice
                        //y en el mismo indice pero en la lista contador suma uno
                        contador.set(ciudades.indexOf(a.toLowerCase()), contador.get(ciudades.indexOf(a.toLowerCase()))+1);
                        break;
                    }
                }
            }else{
                op = a;
            }
        }
    }
    
    public static void sacarRankig(){

        System.out.println("\nRanking");
        int ranking = 0;
        int posicion = 0;
        int ind = 0;

        //Itera la lista contador     
        while(contador.size() > 0){

            //Recorre la lista contador hasta obtener el numero mayor
            for(int i = 0; i<contador.size();i++){

                //Compara si el elemento ubicado en el indice i es 
                //mayor al elemento guardado en la variable ranking
                if(contador.get(i) > ranking){

                    //Si es mayor agrega el elemento de la posicion i en la variable ranking
                    ranking = contador.get(i);

                    //Obtiene el indice del elemento i y lo asigna a la varible ind
                    //Podia guardar solamente i pero aproveche para practicar 
                    ind = contador.indexOf(contador.get(i));
                }
            }
            posicion++;
            System.out.println("#"+posicion+": " + ciudades.get(ind).toUpperCase());
            
            //Elimina el numero ubicado en el indice ind
            contador.remove(ind);
            //Elimina la ciudad ubicada en el indice ind
            ciudades.remove(ind);
            
            ranking = 0;
        }
    }

        
}

