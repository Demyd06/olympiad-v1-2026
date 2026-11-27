package olympiad_v1;

public class Task1 {
    /**
     * need: Reverses an integer | 3311 -> 1133
     * <br>
     * can't: use String, StringBuilder, or character arrays
     *
     */
    public static int reverseNumber(int number) {
        int reverse = 0;

        while (number > 0) {
            int reversee = number % 10;
            reverse = reverse * 10 + reversee;
            number = number / 10;
        }
        System.out.println(reverse);

        number = -580;
        reverse = 0;

        int y = number < 0 ? -1 : 1;
        number = Math.abs(number);

        while (number > 0) {
            reverse = reverse * 10 + number % 10;
            number = number / 10;
        }
        System.out.println(reverse * y);

        number = 1000;
        reverse = 0;

        while (number > 0) {
            reverse = reverse * 10 + number % 10;
            number = number / 10;
        }





        System.out.println(reverse);

        number = 0;
        reverse = 0;

        while (number > 0) {
            reverse = reverse * 10 + number % 10;
            number = number / 10;
        }
        System.out.println(reverse);
        return 0;
    }

    /**
     * can: test your code
     *
     */
    public static void main(String[] args) {
        reverseNumber(1234);
    }
}
