class Book{

 int bookID;
 String title;
 boolean isIssued;
 int issuedTo ;
 
 Book(int bookID, String title){
    this.bookID = bookID;
    this.title = title; 
    this.isIssued = false;
    this.issuedTo = 0;
 }
 
 void displayBook(){
   System.out.println("Book ID : " + bookID);
   System.out.println("Title: " + title);
   System.out.println("Issued: " + isIssued);

       if (isIssued) {
            System.out.println("Issued To Student ID: " + issuedTo);
       }

        System.out.println("----------------------");
 }


}