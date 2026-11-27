package olympiad_v1;

public class Task1 {
    /**
     * need: Reverses an integer | 3311 -> 1133
     * <br>
     * can't: use String, StringBuilder, or character arrays
     *
     */
    public static int reverseNumber(int number) {
        if (number == 0) {
            return 0;
        }

        boolean isNegative = number < 0;
        long num = number;

        if (isNegative) {
            num = -num;
        }

        long reversed = 0;

        while (number != 0) {
            int lastDigit = number % 10;
            reversed = reversed * 10 + lastDigit;
            number = number/10;
        }

        int result = (int) reversed;

        if(isNegative) {
            return (int) -reversed;
        } else {
            return (int) reversed;
        }
    }

    /**
     * can: test your code
     *
     */
    public static void main(String[] args) {
        System.out.println("1234  " + reverseNumber(1234));
        System.out.println("-580  " + reverseNumber(-580));
        System.out.println("1000  " + reverseNumber(1000));
        System.out.println("0  " + reverseNumber(0));
    }
}
