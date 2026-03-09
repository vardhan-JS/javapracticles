import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library lib = new Library();

        boolean running = true;

        while (running) {

            System.out.println("\n1. Add New Book");
            System.out.println("2. Display Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Total Books");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            if (choice == 1) {

                System.out.print("Enter Book ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Book Title: ");
                String title = sc.nextLine();

                Book b = new Book(id, title);
                lib.addBook(b);
            }

            else if (choice == 2) {
                lib.displayBooks();
            }

            else if (choice == 3) {

                System.out.print("Enter Book ID to issue: ");
                int id = sc.nextInt();

                System.out.print("Enter Student ID: ");
                int studentId = sc.nextInt();

                lib.issueBook(id, studentId);
            }

            else if (choice == 4) {

                System.out.print("Enter Book ID to return: ");
                int id = sc.nextInt();

                lib.returnBook(id);
            }

            else if (choice == 5) {
                lib.totalBooks();
            }

            else if (choice == 6) {
                running = false;
                System.out.println("Program Ended.");
            }

            else {
                System.out.println("Invalid choice.");
            }
        }
    }
}