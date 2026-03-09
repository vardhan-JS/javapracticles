import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        boolean running = true;

        while (running) {

            System.out.println("\n1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            if (choice == 1) {

                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Age: ");
                int age = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Branch: ");
                String branch = sc.nextLine();

                Student s = new Student(id, name, age, branch);
                manager.addStudent(s);
            }

            else if (choice == 2) {
                manager.displayAllStudents();
            }

            else if (choice == 3) {

                System.out.print("Enter ID to search: ");
                int id = sc.nextInt();
                manager.searchStudentById(id);
            }

            else if (choice == 4) {
                running = false;
                System.out.println("Program Ended.");
            }

            else {
                System.out.println("Invalid Choice");
            }
        }
    }
}