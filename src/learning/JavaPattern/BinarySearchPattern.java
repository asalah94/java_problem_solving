package learning.JavaPattern;

public class BinarySearchPattern {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9};
        int target = 7;

        int first = 0, last = arr.length - 1;

        while (first <= last) {
            int mid = (first + last) / 2;

            if (arr[mid] == target) {
                System.out.println(mid);
                return;
            }
            if (arr[mid] > target)
                last = mid - 1;
            else
                first = mid + 1;
        }
    }
}

