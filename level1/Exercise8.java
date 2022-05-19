package level1;

import java.util.Scanner;

public class Exercise8 {
    private static final Scanner sc = new Scanner(System.in);
    private static final String message = "Program that requests and then prints the data of a person", c = "-";

    public static void main(String[] args) {
        print(c.repeat(message.length()) + "\n" + message + "\n" + c.repeat(message.length()));
        request_date();
    }

    private static void request_date() {
        String name = request_date_message("\nFirstName and LastName: ");
        Integer age = Integer.parseInt(request_date_message("Age: "));
        String address = request_date_message("Address: ");
        String city = request_date_message("City: ");
        sc.close();

        print(name + " - " + address + " - " + age + " - " + name);
    }

    private static String request_date_message(String message) {
        print(message);
        return sc.nextLine();
    }

    private static void print(String message) {
        System.out.print(message);
    }

}
