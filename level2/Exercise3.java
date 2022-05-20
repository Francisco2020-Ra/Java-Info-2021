package level2;

import java.util.*;

public class Exercise3 {
    private static final Scanner sc = new Scanner(System.in);
    private static int option = -1;
    private static List<Integer> list = new ArrayList<Integer>();
    private static final String message = "Program to load the ArrayList (in order), print, " +
            "print in reverse order (reverse), shuffle the arrayList, and print again.", c = "-";

    public static void main(String[] args) {
        showMessage(c.repeat(message.length()) + "\n" + message + "\n" + c.repeat(message.length()));
        menu();
    }

    public static void menu() {
        showMessage("Welcomen!!!");
        showMessage("Please enter an option");
        showMessage("Remember that to start you must first load the decks!!");

        while (option != 0) {
            showMessage("1-Load decks"
                    + "\n2-Show\n"
                    + "3-Show inverse\n"
                    + "4-Mix\n"
                    + "0-GetOut");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    load(); break;
                case 2:
                    print(); break;
                case 3:
                    showInverse(); break;
                case 4:
                    mix(); break;
                case 0:
                    option = 0; break;
                default:
                    showMessage("Invalid option..."); break;
            }
        }
    }

    public static void load() {
        for (int i = 2; i <= 9; i++) {
            list.add(i);
        }
        showMessage("List loaded successfully!! Let's continue...");
    }

    public static void print() {
        showMessage("Card list");
        showMessage(String.valueOf(list));
    }

    public static void showInverse() {
        Collections.reverse(list);
        showMessage(String.valueOf(list));
    }

    public static void mix() {
        Collections.shuffle(list);
        showMessage(String.valueOf(list));
    }

    private static void showMessage(String message){
        System.out.println(message);
    }
}

