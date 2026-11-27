package olympiad_v1;


public class Task2 {
    /**
     * need: Find the missing number in a sequence of
     */
    public static int findMissingNumber(int[] numbers) {
        int expectedSum = 0;
        for (int i = 1; i <=numbers.length ; i++) {
            expectedSum +=1;
        }

        int actualSum = 0;
        for (int i = 0; i <numbers.length ; i++) {
            actualSum += numbers[i];
        }
        return expectedSum - actualSum;
    }

    /**
     * can: test your code
     */
    public static void main(String[] args) {
        // TODO: test me

        int[] numbers1 = {3, 1, 4, 5};
        int[] numbers2 = {2, 3};
        int[] numbers3 = {1, 2, 3};
        int[] numbers4 = {2};

    }
}
