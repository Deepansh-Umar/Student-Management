import java.util.Arrays;

public class Student {
    private String rollNo;
    private String name;
    private String department;
    private double[] marks;

    public Student(String rollNo, String name, String department, double[] marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.department = department;
        this.marks = marks;
    }

    public String getRollNo() { return rollNo; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double[] getMarks() { return marks; }

    public void setName(String name) { this.name = name; }
    public void setDepartment(String department) { this.department = department; }
    public void setMarks(double[] marks) { this.marks = marks; }

    public double calculateGPA() {
        double total = 0;
        for (double mark : marks) total += mark;
        return total / marks.length / 10; // GPA on scale of 10
    }

    @Override
    public String toString() {
        return String.format("RollNo: %s, Name: %s, Dept: %s, GPA: %.2f, Marks: %s",
                rollNo, name, department, calculateGPA(), Arrays.toString(marks));
    }
}
