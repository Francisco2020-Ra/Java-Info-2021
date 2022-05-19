package level1;

import java.util.Scanner;

public class Exercise1 {

    private static final Scanner sc = new Scanner(System.in);
    private static final String message = "Program that asks to enter your name and prints it on the screen with format";

    public static void main(String[] args) {
        System.out.println(message);
        enter_name();
    }

    private static void enter_name() {
        System.out.print("Enter your name: ");
        System.out.println("Hello " + sc.nextLine() + "!!!");
        sc.close();
    }
}