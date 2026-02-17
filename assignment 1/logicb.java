public class logicb {

static void printpatterns(int n) {
int mid = n / 2;

if (n % 2 == 0) {
            System.out.println("Please write the odd no");
  }

  for (int i = 0; i < n; i++) {

            int outerSpaces = mid - row;
            int innerSpaces = 2 * row - 1;

      
            for (int j = 0; j < outerSpaces; j++) {
                System.out.print(" ");
            }


            System.out.print("*");

if (int row > 0) {
for (int j = 0; j < innerSpaces; j++) {
 System.out.print(" ");
  }
                System.out.print("*");
            }

            
            System.out.println();
 }
 }

    public static void main(String[] args) {
        printpatterns(11);
  }
}
