import java.util.Scanner;

class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("\n--- Calculator ---");

                System.out.print("Enter first number: ");
                double num1 = sc.nextDouble();

                System.out.print("Enter second number: ");
                double num2 = sc.nextDouble();

                System.out.print("Enter operator (+, -, *, /): ");
                char op = sc.next().charAt(0);

                double result = 0;

                switch (op) {
                    case '+':
                        result = num1 + num2;
                        break;

                    case '-':
                        result = num1 - num2;
                        break;

                    case '*':
                        result = num1 * num2;
                        break;

                    case '/':
                        if (num2 == 0) {
                            throw new ArithmeticException("Cannot divide by zero");
                        }
                        result = num1 / num2;
                        break;

                    default:
                        throw new IllegalArgumentException("Invalid operator");
                }

                System.out.println("Result = " + result);

            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());

            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());

            } catch (Exception e) {
                System.out.println("Invalid input! Please enter numbers only.");
                sc.nextLine(); // clear wrong input
            }

            //End Option
            System.out.print("\nPress 0 to Exit or 1 to Continue: ");
            int choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("Calculator Ended.");
                break;
            }
        }

        sc.close();
    }
}