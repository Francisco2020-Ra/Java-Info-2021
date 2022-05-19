package level1;

import java.util.Scanner;

public class Exercise9 {
    private static Scanner sc = new Scanner(System.in);
    private static int op = -1;
    private static final String message = "Program that requests and then prints the data of a person", c = "-";

    public static void main(String[] args) {
        print(c.repeat(message.length()) + "\n" + message + "\n" + c.repeat(message.length()));
        request_value();
    }

    public static void request_value() {
        while (op != 0) {
            String data = request_date_message("\nEnter a word, text or phrase:");
            char a = request_date_message("What letter do you want to count?: ").charAt(0);

            print("The letter " + a + " is repeated  " + count_letters(data, a) + " times");

            op = Integer.parseInt(request_date_message("\nDo you want to re-enter?? <1-Yes//0-Not>: "));
        }
        print("Come back soon!!!");
        sc.close();
    }

    private static int count_letters(String data, char a) {
        int counter = 0;
        for (int i = 0; i < data.length(); i++) {
            if (data.charAt(i) == a) {
                counter++;
            }
        }
        return counter;
    }

    private static String request_date_message(String message) {
        print(message);
        return sc.nextLine();
    }

    private static void print(String message) {
        System.out.print(message);
    }
}
