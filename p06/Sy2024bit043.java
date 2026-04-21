class Sy2024bit043{
    public static void main(String[] args) {

        String binary = "1011";      // Binary number
        String octal = "17";         // Octal number
        String hex = "1A";           // Hexadecimal number

        int decimalFromBinary = Integer.parseInt(binary, 2);
        int decimalFromOctal  = Integer.parseInt(octal, 8);
        int decimalFromHex    = Integer.parseInt(hex, 16);

        System.out.println("Binary to Decimal: " + decimalFromBinary);
        System.out.println("Octal to Decimal : " + decimalFromOctal);
        System.out.println("Hex to Decimal   : " + decimalFromHex);
    }
}