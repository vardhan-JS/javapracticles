import java.util.ArrayList;

class StudentManager{
  ArrayList<Student> students = new ArrayList<>();

  void addStudent(Student s){
       students.add(s);
       System.out.println("Student added successfully.");
 }

 void displayAllStudents(){
     if(students.size() == 0){
        System.out.println("No Student available.");
        return ;
     }
     
     for(Student s : students){ 
         s.display();
      }
 }

 void searchStudentById(int id){
     boolean found = false ;
      
     for(Student s : students){
       if(s.id == id){
          System.out.println("Student found. ");
          s.display();
          found = true ;
          break ;
        }
      }

     if(!found){
      System.out.println("Student not found."); 
     }
 }



}

