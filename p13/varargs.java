class Varargs{

   
    static void show(int nums) {
        System.out.print("Numbers: ");
        for (int n : nums) {
            System.out.print(n + " ");
        }
        System.out.println();
    }


    static void names(String s) {
        System.out.print("Names: ");
        for (String name : s) {
            System.out.print(name + " ");
        }
        System.out.println();
    }

    static void student(String name, int... marks) {
        System.out.print(name + " Marks: ");
        for (int m : marks) {
            System.out.print(m + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        show();
        show(10);
        show(45,75,85);

        names();
        names("Rohit");
        names("Rohit", "Sharma");

        
    }
}