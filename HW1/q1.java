package HW1;

public class q1 {
    public static int chainNumber;

    public static long reverseNumber(long num) {
        String str = Long.toString(num);
        return Long.parseLong(String.valueOf(new StringBuilder(str).reverse()));
    }

    public static long findPalindrome(long num, boolean isPrint) {
        chainNumber++;
        long sum = num + reverseNumber(num);
        if (isPrint) System.out.println(num + " + " + reverseNumber(num) + " = " + sum);
        if (sum == reverseNumber(sum)) return chainNumber;

        return findPalindrome(sum, isPrint);
    }


    public static void main(String[] args) {
        int maxChain = 0;
        int numberOfMaxChain = 0;

        for (int i = 10; i < 100; i++) {
            chainNumber = 0;

            if (findPalindrome(i, false) > maxChain) {
                maxChain = chainNumber;
                numberOfMaxChain = i;
            }
        }

        System.out.println("\n" + numberOfMaxChain + " has the maximum chain number which is " + maxChain);

        System.out.println("\nThe chains are below:");
        findPalindrome(numberOfMaxChain, true);
    }
}
