package learning.JavaPattern;

public class PrefixSumExample {
    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8,9,7,4};

        // Step 1: build prefix sum array
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        int l = 2;
        int r = 4;

        int rangeSum;
        if (l > 0) {
            rangeSum = prefix[r] - prefix[l - 1];
        }
        else {
            rangeSum = prefix[r];
        }

        System.out.println("Sum from index " + l + " to " + r + " = " + rangeSum);
    }
}
