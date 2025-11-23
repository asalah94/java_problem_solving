package learning.problemSolving;

import java.util.*;

public class arrayProblems {

    public static void main(String[] args) {
        int[] arr = new int[]{5, 69, 7, 10, 30, 30};
        System.out.println(findMax(arr));
        countOccurrences(arr, 30);
        reverseArr(arr);
        System.out.println(containsDuplicate(arr));
        removeDuplicatesUnsorted(arr);
    }

    private static int findMax(int[] array) {
        int max = 0;
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    private static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                return false;
            }
        }
        return true;
    }

    private static double calculateAverage(int[] array) {

        int sum = 0;
        for (int num : array) {

            sum += num;
        }

        return sum / array.length;
    }

    private static void reverseArr(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;

        }
        System.out.println(Arrays.toString(array));

    }

    private static int countOccurrences(int[] arr, int target) {
        int count = 0;
        for (int num : arr) {
            if (num == target) {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }

    private static boolean containsDuplicate(int[] array) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : array) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }


    private static void removeDuplicatesUnsorted(int[] arr) {

        HashSet<Integer> uniqueSet = new HashSet<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int num : arr) {
            if (uniqueSet.add(num)) {
                arrayList.add(num);
            }
        }

        System.out.println(arrayList);
    }
}