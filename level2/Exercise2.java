package level2;

import java.util.*;

public class Exercise2 {
    private static final Scanner sc = new Scanner(System.in);
    private static int option = -1;
    private static List<Integer> list = new ArrayList<Integer>();
    private static final String message = "Program that prints the size and elements of a list", c = "-";

    public static void main(String[] args) {
        print(c.repeat(message.length()) + "\n" + message + "\n" + c.repeat(message.length()));
        loadValues();
    }

    private static void loadValues() {
        int counter = 5;
        while (option != 0) {
            try {
                print("\nAdd five whole numbers: \n");

                for (int i = 1; i <= counter; i++) {
                    list.add(requestDateMessage("Value #" + i + ": "));
                }

                list.add(0, requestDateMessage("Add a value to the top of the list:"));
                list.add(requestDateMessage("Add a value to the end of the list:"));
                printListValues();
            } catch (Exception e) {
                print("\nInteger values only, re-enter!!\n");
                list.clear();
                sc.nextLine();
                loadValues();
            }
            option = requestDateMessage("\nDo you wish to continue?<1-Yes//0-Not>: ");
            list.clear();
        }
        sc.close();
    }

    private static void printListValues() {
        print("\t\t\nYour list: ");
        for (Integer lis : list) {
            print(String.valueOf(lis));
        }
        print("\nList size before adding values: " + (list.size() - 2));
        print("\nCurrent list size: " + list.size());
    }

    private static int requestDateMessage(String message) {
        print(message);
        return sc.nextInt();
    }

    private static void print(String message) {
        System.out.print(message);
    }
}
