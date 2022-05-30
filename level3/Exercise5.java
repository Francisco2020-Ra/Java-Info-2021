package level3;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise5 {
    private static Map<String, Integer> mapStudents = new HashMap<>();

    public static void main(String[] args) {
        uploadStudentList(createStudentList());
        System.out.println(mapStudents);
        //System.out.println(mapStudents.get("Jorge Jaralungui"));
    }
    private static void uploadStudentList(List<Student> students) {
        students.forEach(student -> mapStudents.put(
                        student.getFirstName() + " " + student.getSecondName(),
                        LocalDate.now().getYear() - student.getDateOfBirth().getYear()));
    }
    private static List<Student> createStudentList() {
        return List.of(
                new Student("Homero", "Simpson", getYear("1990-02-10")),
                new Student("Diego", "Salta", getYear("1990-03-16")),
                new Student("Marcela", "Moreno",getYear("1989-04-17")),
                new Student("Jorge", "Jaralungui", getYear("1953-05-18")),
                new Student("Juan", "Quinteros", getYear("1998-04-30"))
        );
    }
    private static LocalDate getYear(String date){
        return LocalDate.parse(date);
    }
}
class Student {
    private String firstName;
    private String secondName;
    private LocalDate dateOfBirth;
    public Student(String firstName, String secondName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.dateOfBirth = dateOfBirth;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getSecondName() {
        return this.secondName;
    }
    public LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }
}
