package level1;

import java.util.Scanner;


public class Exercise3 {

    private static final  Scanner sc = new Scanner(System.in);
    private static Integer value = -1;
    private static final String message = "Program that prints a sequence of numbers on the screen", c ="-";
    
    public static void main(String[] args) {
        System.out.println(c.repeat(message.length()) +"\n"+ message +"\n"+ c.repeat(message.length()));
        request_value();
    }

    private static void request_value(){
       while(value != 0){
            message("Please enter a value: ");

            factorizar(value);

            message("Do you want to re-enter?? <1-Yes//0-Not>: ");
        }
        System.out.println("\nCome back soon!!!");
    }

    private static void factorizar(int valor){
        for(int i = 1; i <= valor; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    private static void message(String message){
        System.out.print(message);
        value = sc.nextInt();
    }

}
