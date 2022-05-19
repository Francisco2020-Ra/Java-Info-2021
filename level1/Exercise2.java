package level1;

import java.util.Scanner;

public class Exercise2 {

    private static final Scanner sc = new Scanner(System.in);
    private static final String message = "Program that requires two numbers and prints on the screen " +
            "the result of the Addition, Subtraction, Multiplication, Division and Mod", c = "-";

    public static void main(String[] args) {
        information_about_the_program();
        request_values();
    }

    private static void information_about_the_program() {
        System.out.println(c.repeat(message.length())
        +"\n"+ message +"\n"+ c.repeat(message.length()));
    }

    private static void request_values() {
        System.out.print("Enter two numbers: ");
        operations(sc.nextInt(), sc.nextInt());
        sc.close();
    }

    public static void operations(int value1, int value2) {
        addition_of_numbers(value1, value2);
        subtraction_to_numbers(value1, value2);
        multiplication_to_numbers(value1, value2);
        division_to_numbers(value1, value2);
        mod_to_numbers(value1, value2);
    }

    public static void addition_of_numbers(int value1, int value2) {
        message("Result of addition: ", value1 + value2);
    }

    public static void subtraction_to_numbers(int value1, int value2) {
        message("Result of subtraction", value1 - value2);
    }

    public static void multiplication_to_numbers(int value1, int value2) {
        message("Result of multiplication", value1 * value2);
    }

    public static void division_to_numbers(int value1, int value2) {
        if (value2 == 0) {
            System.out.println("For division the second value must be non-zero");
        } else {
            message("Result of division", value1 / value2);
        }
    }

    public static void mod_to_numbers(int value1, int value2) {
        if (value2 == 0) {
            System.out.println("For mod the second value must be non-zero");
        } else {
            message("Result of mod", value1 % value2);
        }
    }

    private static void message(String message, Integer result) {
        System.out.println(String.format("%s is %d", message, result));
    }
}
