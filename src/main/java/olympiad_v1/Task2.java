package olympiad_v1;


public class Task2 {
    /**
     * need: Find the missing number in a sequence of
     */
    public static int findMissingNumber(int[] numbers) {
        int i = 0;
        int temp = 0;
        for (int j = 0; j < numbers.length; j++) {
            temp++;
            while (temp != numbers[i]) {
                for (i = 0; i < numbers.length; i++) {
                    System.out.println("відсутні числа всі крім " + numbers[i]);
                }
            }
        }
     return 0;
    }
    //System.out.println("Число знайдено! " + numbers[j] + "під індексом " + i);

    /**
     * can: test your code
     */
    public static void main(String[] args) {
        int[] numbers = {3,1,4,5};
        findMissingNumber(numbers);
    }
}
