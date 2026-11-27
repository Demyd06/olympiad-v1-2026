package olympiad_v1;

import java.util.HashSet;

public class Task1 {
    /**
     * need: Reverses an integer | 3311 -> 1133
     * <br>
     * can't: use String, StringBuilder, or character arrays
     *
     */
    public static int reverseNumber(int number) {
        int reversedNum = 0;
        while(number > 0) {
            reversedNum = number % 10;
            System.out.print(reversedNum);
            number = number / 10;
        }
        return 0;
    }

    /**
     * can: test your code
     *
     */
    public static void main(String[] args) {
        int number = 1234;
        reverseNumber(number);
    }
}
