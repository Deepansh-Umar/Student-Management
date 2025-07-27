import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentService service = new StudentService();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n==== Student Record System ====");
            System.out.println("1. Add Student\n2. View All\n3. Search\n4. Update\n5. Delete\n6. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Roll No: ");
                    String roll = sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Department: ");
                    String dept = sc.nextLine();
                    double[] marks = new double[5];
                    System.out.println("Enter marks for 5 subjects:");
                    for (int i = 0; i < 5; i++) marks[i] = sc.nextDouble();
                    service.addStudent(new Student(roll, name, dept, marks));
                    sc.nextLine();
                }
                case 2 -> service.viewAll();
                case 3 -> {
                    System.out.print("Enter Roll No: ");
                    service.searchByRollNo(sc.nextLine());
                }
                case 4 -> {
                    System.out.print("Enter Roll No to update: ");
                    String roll = sc.nextLine();
                    System.out.print("New Name: ");
                    String name = sc.nextLine();
                    System.out.print("New Department: ");
                    String dept = sc.nextLine();
                    double[] marks = new double[5];
                    System.out.println("Enter new marks for 5 subjects:");
                    for (int i = 0; i < 5; i++) marks[i] = sc.nextDouble();
                    service.updateStudent(roll, name, dept, marks);
                    sc.nextLine();
                }
                case 5 -> {
                    System.out.print("Enter Roll No to delete: ");
                    service.deleteStudent(sc.nextLine());
                }
                case 6 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid option.");
            }
        }
    }
}
