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
        int sing = number <= 0 ? -1 : 1;
        long remaining = Math.abs((long) number);
        long reversed = 0;

        while (remaining > 0) {
            int digit = (int) ( remaining% 10);
            reversed = reversed * 10 + digit;
            remaining /= 10;
        }
        long result = sing*reversed;
        if (result> Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        if (result> Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return (int) result;
    }

    /**
     * can: test your code
     *
     */
    public static void main(String[] args) {
        System.out.println("1234->"+reverseNumber(1234));
        System.out.println("-580 ->"+reverseNumber(-580));
        System.out.println("1000 ->"+reverseNumber(1000));
        System.out.println("0 ->"+reverseNumber(0));
    }
}
