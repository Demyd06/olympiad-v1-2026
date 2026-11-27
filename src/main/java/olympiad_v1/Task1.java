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

        while (number !=0){
            int digit = number % 10;
            result = result * 10 + digit;
            number /=10;

        }
        return result;
    }

    /**
     * can: test your code
     *
     */
    public static void main(String[] args) {
        //TODO: test me
        System.out.println(reverseNumber(1234));
        System.out.println(reverseNumber(-580));
        System.out.println(reverseNumber(20000));
        System.out.println(reverseNumber(0));
    }
}
