class Fifth {
    public static void main(String[] args) {
        int n = 3;
        String str = "*";
        String spc = " ";
      
        for (int i = 1; i <= n; i++) {
            System.out.println(spc.repeat(i)+str.repeat(n));
        }

    }
}