package level1;

import java.util.Scanner;

public class Exercise4 {
    private static final Scanner sc = new Scanner(System.in);
    private static Integer value = -1;
    private static final String message = "Program to print the factorial of a number", c ="-";

    public static void main(String[] args) {
        print_message(c.repeat(message.length()) +"\n"+ message +"\n"+ c.repeat(message.length()));
        print_factorial();
    }

    private static void print_factorial() {
        while (value != 0) {
            request_value_message("\nEnter a value: ");

            print_message("The factorial is: " + calculate_factorial(value));

            request_value_message("Do you want to re-enter?? <1-Yes//0-Not>: ");
        }
        print_message("\nCome back soon!!!");
        sc.close();
    }

    private static int calculate_factorial(int value) {
        int b = value;
        for (int i = 1; i <= value - 1; i++) {
            b = b * i;
        }
        return b;
    }

    private static void request_value_message(String message) {
        System.out.print(message);
        value = sc.nextInt();
    }

    private static void print_message(String message){
        System.out.println(message);
    }
}
