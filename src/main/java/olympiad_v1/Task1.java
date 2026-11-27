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
        int reversed =0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
       return reversed;

    }
    public static void main(String[] args) {
        System.out.println(reverseNumber(1234));
        System.out.println(reverseNumber(-580));
        System.out.println(reverseNumber(1000));
        System.out.println(reverseNumber(0));
    }
}
