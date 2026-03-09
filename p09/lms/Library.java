import java.util.ArrayList;

class Library {

    ArrayList<Book> books = new ArrayList<>();

    void addBook(Book b) {
        books.add(b);
        System.out.println("Book added successfully.");
    }

    void displayBooks() {

        if (books.size() == 0) {
            System.out.println("No books available.");
            return;
        }

        int i = 0;

        while (i < books.size()) {
            books.get(i).displayBook();
            i++;
        }
    }

    void issueBook(int id, int studentId) {

        int i = 0;

        while (i < books.size()) {

            Book b = books.get(i);

            if (b.bookID == id && !b.isIssued) {
                b.isIssued = true;
                b.issuedTo = studentId;
                System.out.println("Book issued to Student ID: " + studentId);
                return;
            }

            i++;
        }

        System.out.println("Book not available.");
    }

    void returnBook(int id) {

        int i = 0;

        while (i < books.size()) {

            Book b = books.get(i);

            if (b.bookID == id && b.isIssued) {
                b.isIssued = false;
                b.issuedTo = 0;
                System.out.println("Book returned successfully.");
                return;
            }

            i++;
        }

        System.out.println("Invalid return.");
    }

    void totalBooks() {
        System.out.println("Total Books: " + books.size());
    }
}