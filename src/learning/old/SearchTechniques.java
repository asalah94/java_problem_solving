package learning.old;

public class SearchTechniques {


    public static void main(String[] args) {
        int[] array = {4, 2, 7, 1, 9, 5};
        int[] sortedArray = {1, 2, 4, 5, 7, 9};

        int target = 5;
        //int result = linearSearch(array, target);
        int binaryResult = binarySearch(sortedArray, target);
        System.out.println(binaryResult);
       // System.out.println("Index of " + target + ": " + result);

    }

    private static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the index if target is found
            }
        }
        return -1; // Return -1 if target is not found
    }

    private static int binarySearch(int[] arr, int target) {

     int left = 0;
     int right = arr.length-1;

     while (left <= right)
     {
         int mid = left+(right-left)/2;

         if(arr[mid] == target){
             return mid;
         } else if (arr[mid] < target) {
             left = mid +1;
         }
        else {
            right = mid -1;
        }
     }
     return -1;
    }


}
