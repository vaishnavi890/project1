import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String name;
    private int age;
    private String studentId;

    public Student(String name, int age, String studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student ID: " + studentId + ", Name: " + name + ", Age: " + age;
    }
}

public class StudentRegistration {
    private static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Register Student");
            System.out.println("2. Display Students");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    registerStudent(scanner);
                    break;
                case 2:
                    displayStudents();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void registerStudent(Scanner scanner) {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter student ID: ");
        String studentId = scanner.nextLine();

        Student student = new Student(name, age, studentId);
        students.add(student);
        System.out.println("Student registered successfully!");
    }

    private static void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students registered.");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }
}