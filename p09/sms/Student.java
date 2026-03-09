class Student{
  
   int id;
   String name ;
   int age ;
   String branch ;
 
   Student(int id , String name, int age, String branch){
       this.id = id ;
       this.name = name;
       this.age =age;
       this.branch= branch;
   }

 void display(){
    System.out.println("ID: " + id);
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Branch: " + branch);
    System.out.println("----------------------");
  }
}