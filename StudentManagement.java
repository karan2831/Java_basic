import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int id;
    String name;
    int age;

    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        Scanner sc = new Scanner(System.in); // Scanner created
        int choice = 0;

        do {
            System.out.println("\n=== Student Management ===");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Delete Student");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                sc.nextLine(); // consume newline
                System.out.print("Enter Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Age: ");
                int age = sc.nextInt();

                students.add(new Student(id, name, age));
                System.out.println("Student added successfully!");
            }

            else if (choice == 2) {
                if (students.size() == 0) {
                    System.out.println("No students to display!");
                } else {
                    System.out.println("\n--- Student List ---");
                    for (Student s : students) {
                        System.out.println("ID: " + s.id + ", Name: " + s.name + ", Age: " + s.age);
                    }
                }
            }

            else if (choice == 3) {
                System.out.print("Enter ID to delete: ");
                int idToDelete = sc.nextInt();
                boolean found = false;

                for (int i = 0; i < students.size(); i++) {
                    if (students.get(i).id == idToDelete) {
                        students.remove(i);
                        found = true;
                        System.out.println("Student deleted.");
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Student not found.");
                }
            }

            else if (choice == 4) {
                System.out.println("Exiting program...");
            }

            else {
                System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        // ? Close the scanner at the end!
        sc.close();
    }
}
