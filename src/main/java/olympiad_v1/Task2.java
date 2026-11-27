package olympiad_v1;


public class Task2 {
    /**
     * need: Find the missing number in a sequence of
     */
    public static int findMissingNumber(int[] numbers) {
        if (numbers == null || numbers.length < 1){
            System.out.print("Масив має містити більше ніж 1 значення");
            return 0;
        }
        int expectedSum = 0;
        for (int i = 1; i <=numbers.length +1; i++) {
            expectedSum +=i;
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
        int[] numbers5 = {};
        int[] numbers6 = null;

        System.out.println(findMissingNumber(numbers1));
        System.out.println(findMissingNumber(numbers2));
        System.out.println(findMissingNumber(numbers3));
        System.out.println(findMissingNumber(numbers4));
        System.out.println(findMissingNumber(numbers5));
        System.out.println(findMissingNumber(numbers6));

    }
}
