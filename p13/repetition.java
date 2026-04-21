class Repetition {
    public static void main(String[] args) {
        try {
            if (args.length < 2) {
                System.out.println("Usage: java Example 'arg1' 'arg2'");
                return;
            }
            if (args.length > 2) {
                System.out.println("Extra arguments detected. Skipping excess inputs...");
            }
            String firstInput = args[0];
            String text = args[1];
            if (firstInput.length() == 0) {
                System.out.println("First argument must be a character.");
                return;
            }
            if (firstInput.length() > 1) {
                System.out.println("First input has multiple characters.");
                System.out.println("Taking first character only.");
            }
            char ch = firstInput.charAt(0);

            // Approach 1: Loop Method
            int count1 = 0;
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == ch) {
                    count1++;
                }
            }

            // Approach 2: Replace Method
            int count2 = text.length() - text.replace(String.valueOf(ch), "").length();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}   