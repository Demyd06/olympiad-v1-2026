package olympiad_v1;

public class Task1 {
    /**
     * need: Reverses an integer | 3311 -> 1133
     * <br>
     * can't: use String, StringBuilder, or character arrays
     *
     */
    public static int reverseNumber(int number) {
        int result = 0;
        while (number != 0)
        {
            result = result * 10 + number % 10;
            number /=  10;

        }
        return result;
    }

    /**
     * can: test your code
     *
     */
    public static void main(String[] args) {
        System.out.println(reverseNumber(1234));
        System.out.println(reverseNumber(-580));
        System.out.println(reverseNumber(1000));
        System.out.println(reverseNumber(0));
        System.out.println(reverseNumber(3311));
    }
}
