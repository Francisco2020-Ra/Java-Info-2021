package level1;


import java.util.Scanner;

public class Exercise7 {
    private static final Scanner sc = new Scanner(System.in);
    private static String value;
    private static final String message = "Program that converts a word to uppercase", c = "-";

    public static void main(String[] args) {
        print(c.repeat(message.length()) + "\n" + message + "\n" + c.repeat(message.length()));
        init();
    }

    private static void init() {
        request_value_message("\nEnter a word: ");

        to_uppercase(value);

        sc.close();
    }

    public static void to_uppercase(String value) {
        String new_value = new String();

        for (int i = 0; i < value.length(); i++) {
            if (value.charAt(i) >= 97 && value.charAt(i) <= 122) {
                new_value += (char) (value.charAt(i) - 32);
            } else {
                print("please, only lowercase words");
                break;
            }
        }
        print(new_value);
    }

    private static void request_value_message(String message) {
        print(message);
        value = sc.nextLine();
    }

    private static void print(String message) {
        System.out.print(message);
    }
}
