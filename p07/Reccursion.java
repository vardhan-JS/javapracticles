class Reccursion {

    // Recursive factorial
    static int recc(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else if (n < 0) {
            return -1;
        } else {
            return n * recc(n - 1);
        }
    }

    // Iterative factorial
    static int iteration(int n) {
        int result = 1;

        if (n < 0) {
            return -1;
        }

        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(recc(4));
        System.out.println(iteration(5));
        System.out.println(recc(1));
        System.out.println(iteration(-1));
    }
}