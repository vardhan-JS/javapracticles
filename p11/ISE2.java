class Pattern {

    public static void printPattern(int size) {

        // Upper part
        for (int i = 1; i <= size; i++) {
            System.out.print(" ".repeat(size - i));

            
            System.out.print("*".repeat(2 * i - 1));

            System.out.println();
        }

        // Lower part
        for (int i = size - 1; i >= 1; i--) {

         
            System.out.print(" ".repeat(size - i));


            System.out.print("*".repeat(2 * i - 1));

            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(6); 
    }
}