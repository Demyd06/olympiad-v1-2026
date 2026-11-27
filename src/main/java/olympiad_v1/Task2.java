package olympiad_v1;


public class Task2 {
    /**
     * need: Find the missing number in a sequence of
     */
    public static int findMissingNumber(int[] numbers) {
        long n = numbers.length;
        long count = n + 1;
        long sum = count * (count + 1) / 2;
        long ssum = 0;

        for (int i = 0; i < numbers.length; i++)
            ssum += numbers[i];
        return (int) (sum - ssum);
    }

    /**
     * can: test your code
     */
    public static void main(String[] args) {
        System.out.println(findMissingNumber(new int[]{3, 1, 4, 5}));
        System.out.println(findMissingNumber(new int[]{2, 3}));
        System.out.println(findMissingNumber(new int[]{1, 2, 3}));
        System.out.println(findMissingNumber(new int[]{2}));


    }
}
