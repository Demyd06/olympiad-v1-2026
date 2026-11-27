package olympiad_v1;


import java.util.Arrays;

public class Task2 {
    /**
     * need: Find the missing number in a sequence of
     */
    public static int findMissingNumber(int[] numbers) {
        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] != i + 1) {
                return i + 1;
            }
        }

        return 0;
    }

    /**
     * can: test your code
     */
    public static void main(String[] args) {
        System.out.println(findMissingNumber(new int[]{3, 1, 4, 5}));
        System.out.println(findMissingNumber(new int[]{2,3}));
        System.out.println(findMissingNumber(new int[]{1, 2, 3}));
        System.out.println(findMissingNumber(new int[]{2}));
    }
}
