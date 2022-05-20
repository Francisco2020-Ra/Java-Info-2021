package level2;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise1 {
    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<String> cities = new ArrayList<String>();
    private static ArrayList<Integer> counter = new ArrayList<Integer>();
    private static final String message = "Program that shows the ranking of cities", c = "-";

    public static void main(String[] args) {
        System.out.println(c.repeat(message.length()) + "\n" + message + "\n" + c.repeat(message.length()));
        enterCities();
        getRanking();
    }

    public static void enterCities() {
        int add = 1;
        String op = "1";

        while (!op.equals("0")) {
            System.out.print("Enter city<0-finalize>: ");
            String a = sc.nextLine();

            if (a.equals("")) {
                System.out.println("You must enter a city");
            } else {

                if (!a.equals("0")) {

                    /**Browse the list of cities*/
                    for (int i = 0; i <= cities.size(); ) {

                        /**If the element does not exist, add it in lowercase*/
                        if (!cities.contains(a.toLowerCase())) {

                            /**Add the city to the cities list*/
                            cities.add(a.toLowerCase());

                            /**
                             * Get the index where the city was added and in the
                             * same index but in the counter list add a number
                             */
                            int b = cities.indexOf(a.toLowerCase());
                            counter.add(cities.indexOf(a.toLowerCase()), add);
                            break;
                        } else {
                            /**
                             * If the element exists, get the index
                             * and in the same index but in the list counter adds one
                             */
                            counter.set(cities.indexOf(a.toLowerCase()), counter.get(cities.indexOf(a.toLowerCase())) + 1);
                            break;
                        }
                    }
                } else {
                    op = a;
                }
            }
        }
    }

    public static void getRanking() {
        System.out.println("\nRanking");
        int ranking = 0, position = 0, index = 0;

        /**Iterate the counter list*/
        while (counter.size() > 0) {

            /**Loop through the counter list until you get the largest number*/
            for (int i = 0; i < counter.size(); i++) {

                /**
                 * Check if the element located at index i is
                 * greater than the element stored in the ranking variable
                 */
                if (counter.get(i) > ranking) {

                    /**If it is greater, add the element of position i in the ranking variable*/
                    ranking = counter.get(i);

                    /**Gets the index of the element i and assigns it to the variable index*/
                    index = counter.indexOf(counter.get(i));
                }
            }
            position++;
            System.out.println("#" + position + ": " + cities.get(index).toUpperCase());

            /**Delete the number located in the index index*/
            counter.remove(index);

            /**Delete the city located in the index index*/
            cities.remove(index);
            ranking = 0;
        }
    }
}

