package level2;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Exercise4 {
    private static List<String> students = new ArrayList<String>();
    private static ArrayList<ArrayList<String>> courses = new ArrayList<>();
    private static final String path = "C:\\Users\\francisco\\Documents\\1-Backend\\Informatorio\\Java-Info-2021\\level2\\txt\\students.txt";
    private static final String message = "Program that loads an arrayList with 12 student names (String), " +
            "then separates them into 3 courses (3 arrayList) and prints", c = "-";

    public static void main(String[] args) throws IOException {
        print(c.repeat(message.length()) + "\n" + message + "\n" + c.repeat(message.length()));
        loadStudents();
        createSublist();
    }

    private static void loadStudents() throws IOException {
        File file = new File(path);
        String name;
        BufferedReader line = new BufferedReader(new FileReader(file));
        while ((name = line.readLine()) != null) {
            students.add(name);
        }
        line.close();
        System.out.println(students);
    }

    private static void createSublist() {
        courses.add(new ArrayList<>(students.subList(0, 4)));
        courses.add(new ArrayList<>(students.subList(4, 8)));
        courses.add(new ArrayList<>(students.subList(8, 12)));
        for (ArrayList a : courses) {
            print(String.valueOf(a));
        }
    }

    private static void print(String message) {
        System.out.println(message);
    }
}