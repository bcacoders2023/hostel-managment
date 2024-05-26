import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    private int id;
    private String name;
    private String roomNumber;

    public Student(int id, String name, String roomNumber) {
        this.id = id;
        this.name = name;
        this.roomNumber = roomNumber;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRoomNumber() {
        return roomNumber;
    }
}

public class HostelManagement {
    private static List<Student> studentList = new ArrayList<>();
    private static int nextId = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nHostel Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addStudent(scanner);
                    break;
                case 2:
                    displayStudents();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);

        scanner.close();
    }

    private static void addStudent(Scanner scanner) {
        System.out.print("Enter student name: ");
        String name = scanner.next();
        System.out.print("Enter student room number: ");
        String roomNumber = scanner.next();

        Student student = new Student(nextId++, name, roomNumber);
        studentList.add(student);
        System.out.println("Student added successfully!");
    }

    private static void displayStudents() {
        System.out.println("\nStudent Records:");
        for (Student student : studentList) {
            System.out.println("ID: " + student.getId() + ", Name: " + student.getName() + ", Room Number: " + student.getRoomNumber());
        }
    }
}
