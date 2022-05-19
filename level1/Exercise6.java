package level1;

import java.util.Scanner;

public class Exercise6 {
    private static final Scanner sc = new Scanner(System.in);
    private static int value = -1, value1, value2;
    private static final String message = "Program that asks for two numbers and performs the power operation ", c = "-";

    public static void main(String[] args) {
        print(c.repeat(message.length()) + "\n" + message + "\n" + c.repeat(message.length()));
        init();
    }

    private static void init() {
        while (value != 0) {
            request_value_message("\nEnter the first value: ", "Enter the second value: ");

            power(value1, value2);

            request_option_message("\nDo you want to re-enter?? <1-Yes//0-Not>: ");
        }
        print("\nCome back soon!!!");
        sc.close();
    }

    public static void power(int value1, int value2) {
        int value3 = value1;

        for (int i = 1; i < value2; i++) {
            value3 = value3 * value1;
        }
        print(value1 + " to the power of " + value2 + " = " + value3);
    }

    private static void request_value_message(String message1, String message2) {
        print(message1);
        value1 = sc.nextInt();
        print(message2);
        value2 = sc.nextInt();
    }

    private static void request_option_message(String message) {
        print(message);
        value = sc.nextInt();
    }

    private static void print(String message) {
        System.out.print(message);
    }
}
