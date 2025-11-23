package learning.old;

public class SortingTechnique {

    public static void main(String[] args) {
        int[] arr = new int[]{5,69,7,10,30,30};
        System.out.println("Array After Bubble Sort");
        //bubbleSort(arr);
        insertionSort(arr);

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }
    private static void bubbleSort(int[] arr) {
        int n = arr.length-1;
        for(int i =0;i<n ; i++){
        for(int j= 0;j<n-i;j++){
            if(arr[j]>arr[j+1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
        }


    }


    public static void insertionSort(int[] array) {
        int n = array.length;

        for(int i= 1;i<n ; i++){
            int j = i-1;
            int key = array[i];

            while (j >= 0 && array[j] > key) {

                array[j+1] = array[j];
                j= j-1;

            }
            array[j+1]= key;

        }
    }






}
