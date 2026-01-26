class Fourth {
    public static void main(String[] args) {
        int n = 5;
        String str = "*";
        String spc = " ";

        for (int i = 0; i < n; i++) {
            System.out.println(
                str.repeat(i + 1) + spc.repeat(n - i - 1)
            );
        }
    }
}