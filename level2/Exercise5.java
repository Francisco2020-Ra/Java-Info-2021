package level2;

import java.util.*;

public class Exercise5 {
    private static List<Integer> hours_worked = new ArrayList<Integer>();
    private static List<Integer> hourly_value = new ArrayList<Integer>();
    private static List<Integer> salary_day = new ArrayList<Integer>();
    private static final String message = "Program to print the salary of an employee", c = "-";

    public static void main(String[] args) {
        System.out.println(c.repeat(message.length()) + "\n" + message + "\n" + c.repeat(message.length()));
        uploadRecord();
        System.out.println("Total: $ " + calculateSalary());
    }

    private static void uploadRecord(){
        hours_worked.add(6);
        hours_worked.add(7);
        hours_worked.add(8);
        hours_worked.add(4);
        hours_worked.add(5);

        hourly_value.add(350);
        hourly_value.add(345);
        hourly_value.add(550);
        hourly_value.add(600);
        hourly_value.add(320);
    }

    private static Integer calculateSalary() {
        Integer totalSalary = 0;
        for (int i = 0; i <= hours_worked.size() - 1; i++) {
            salary_day.add(i, hours_worked.get(i) * hourly_value.get(i));
            totalSalary += salary_day.get(i);
        }
        System.out.println(salary_day);
        return totalSalary;
    }
}
