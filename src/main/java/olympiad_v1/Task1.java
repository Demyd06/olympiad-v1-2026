package olympiad_v1;

public class Task1 {
    /**
     * need: Reverses an integer | 3311 -> 1133
     * <br>
     * can't: use String, StringBuilder, or character arrays
     *
     */
    public static int reverseNumber(int number) {
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        return reversed;
    }

    /**
     * can: test your code
     *
     */
    public static void main(String[] args) {
        System.out.println("1234 -> " + reverseNumber(1234));
        System.out.println("-580 -> " + reverseNumber(-580));
    }
}
// test