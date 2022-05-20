package level2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise7 {
    private static final Scanner sc = new Scanner(System.in);
    private static final List<String> values = new ArrayList<>();
    private static int value1, value2;
    private static final String message = "Program FizzBuzz, the first value must be less than the second", c = "-";

    public static void main(String[] args) {
        System.out.println(c.repeat(message.length()) + "\n" + message + "\n" + c.repeat(message.length()));
        requestValue();
        checkValues(value1, value2);
        System.out.println(values);
    }

    private static void requestValue() {
        System.out.print("Enter the first value: ");
        value1 = sc.nextInt();
        System.out.print("Enter the second value: ");
        value2 = sc.nextInt();
        validateValues(value1, value2);
    }

    private static void validateValues(int value1, int value2) {
        if (value1 >= value2) {
            System.out.println("The first value must be less than the second");
            requestValue();
        }
    }

    public static void checkValues(int value1, int value2) {
        int counter = 0;
        for (int i = value1; i < value2; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                values.add(counter++, "FizzBuzz");
            } else if (i % 2 == 0) {
                values.add(counter++, "Fizz");
            } else if (i % 3 == 0) {
                values.add(counter++, "Buzz");
            } else {
                values.add(counter++, String.valueOf(i));
            }
        }
    }
}
