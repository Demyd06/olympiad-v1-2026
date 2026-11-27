package olympiad_v1;


public class Task2 {
    /**
     * need: Find the missing number in a sequence of
     */
    public static int findMissingNumber(int[] numbers) {
        long n = numbers.length;
        long expectedSum = (n + 1) * (n + 2) / 2;
        long actualSum = 0;
        for (int num : numbers) {
            actualSum += num;
        }
        return (int) (expectedSum - actualSum);
    }

    /**
     * can: test your code
     */
    public static void main(String[] args) {
        System.out.println("{3,1,4,5}->" + findMissingNumber(new int[]{3, 1, 4, 5}));
        System.out.println("{2,3}->" + findMissingNumber(new int[]{2, 3}));
        System.out.println("{1,2,3}->" + findMissingNumber(new int[]{1, 2, 3}));
        System.out.println("{2}->" + findMissingNumber(new int[]{2}));
    }
}


