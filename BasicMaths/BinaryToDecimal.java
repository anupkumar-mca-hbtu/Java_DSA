package BasicMaths;

public class BinaryToDecimal {
// Convert a binary number (e.g., 1011) to decimal.

    public static void main(String[] args) {

        String binary= "1011";
        double decimal=0;
        int power=0;
        for(int i= binary.length()-1;i>=0;i--) {
            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }
        System.out.println(decimal);
    }

}
