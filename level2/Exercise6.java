package level2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Exercise6 {
    private static Set<Employee> list = new HashSet<Employee>();
    private static Map<Integer, Integer> calculatedSalary = new HashMap<Integer, Integer>();
    private static final String path = "C:\\Users\\francisco\\Documents\\1-Backend\\Informatorio\\Java-Info-2021\\level2\\txt\\employee.txt";
    private static final String message = "Program that calculates the salary (hours worked x valuePerHour), " +
            "then stores in a Map (or Dictionary) where the key (key) is the ID and the value (value) is the calculated salary.", c = "-";

    public static void main(String[] args) throws IOException {
        System.out.println(c.repeat(message.length()) + "\n" + message + "\n" + c.repeat(message.length()));
        loadEmployee();
        calculatedSalary();
    }

    private static void loadEmployee() throws IOException {
        File file = new File(path);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String dataEmployee;

        while ((dataEmployee = bufferedReader.readLine()) != null) {
            list.add(createEmployee(dataEmployee));
        }
    }

    private static Employee createEmployee(String dataEmployee) {
        String[] data = dataEmployee.split(",");
        return new Employee(data[0], data[1], Integer.parseInt(data[2]), Integer.parseInt(data[3]), Integer.parseInt(data[4]));
    }

    private static void calculatedSalary() {
        list.forEach((p) -> calculatedSalary.put(p.getPassport(), p.getHoursWorked() * p.getValueHour()));
        calculatedSalary.forEach((k, v) -> System.out.println("Passport: " + k + ", calculated salary: " + v));
    }

    private static class Employee {
        private String firstName;
        private String lastName;
        private int passport;
        private int hoursWorked;
        private int valueHour;

        public Employee(String firstName, String lastName, int passport, int hoursWorked, int valueHour) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.passport = passport;
            this.hoursWorked = hoursWorked;
            this.valueHour = valueHour;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getPassport() {
            return passport;
        }

        public int getHoursWorked() {
            return hoursWorked;
        }

        public int getValueHour() {
            return valueHour;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setPassport(int passport) {
            this.passport = passport;
        }

        public void setHoursWorked(int hoursWorked) {
            this.hoursWorked = hoursWorked;
        }

        public void setValueHour(int valueHour) {
            this.valueHour = valueHour;
        }
    }
}

