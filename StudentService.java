import java.util.*;

public class StudentService {
    private final Map<String, Student> studentMap = new HashMap<>();

    public void addStudent(Student student) {
        if (studentMap.containsKey(student.getRollNo())) {
            System.out.println("Student with this roll number already exists.");
            return;
        }
        studentMap.put(student.getRollNo(), student);
        System.out.println("Student added successfully.");
    }

    public void viewAll() {
        if (studentMap.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        studentMap.values().forEach(System.out::println);
    }

    public void searchByRollNo(String rollNo) {
        Student student = studentMap.get(rollNo);
        if (student != null) System.out.println(student);
        else System.out.println("Student not found.");
    }

    public void deleteStudent(String rollNo) {
        if (studentMap.remove(rollNo) != null)
            System.out.println("Student deleted.");
        else
            System.out.println("Student not found.");
    }

    public void updateStudent(String rollNo, String name, String department, double[] marks) {
        Student student = studentMap.get(rollNo);
        if (student == null) {
            System.out.println("Student not found.");
            return;
        }
        student.setName(name);
        student.setDepartment(department);
        student.setMarks(marks);
        System.out.println("Student updated.");
    }
}
