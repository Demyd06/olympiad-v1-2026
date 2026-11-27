package olympiad_v1;


public class Task2 {
    /**
     * need: Find the missing number in a sequence of
     */
    public static int findMissingNumber(int[] numbers) {
        int n = numbers.length;

        long ex = (long) (n+1) * (n * 2) / 2;

        long actu = 0;

        for(int number : numbers) {
            actu = actu + number;
        }

        return (int) (ex - actu);
    }

    /**
     * can: test your code
     */
    public static void main(String[] args) {
        int[][] numberss = {
                {3, 1, 4, 5},
                {2, 3},
                {1, 2, 3},
                {2}
        };
        int[] ex = {2,1,4,1};

        for (int i = 0; i < numberss.length; i++) {
            int n = numberss[i].length;
            int result = findMissingNumber(numberss[i]);
            System.out.println(result + ex[i] + n + (n+1) + result);
        }
    }
}
