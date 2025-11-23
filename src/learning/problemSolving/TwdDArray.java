package learning.problemSolving;

public class TwdDArray {


    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Calculate the sum of the 2D array
        int result = sum2DArray(matrix);

        // Display the result
        //System.out.println("The sum of elements in the 2D array is: " + result);
        System.out.println(findMaxElementOnly(matrix));
    }
    public static int sum2DArray(int[][] arr) {
        int totalSum = 0;

        for (int[] row : arr) {
            for (int element : row) {
                totalSum += element;
            }
        }
        return totalSum;
    }
    public static int[] findMaxElement(int[][] arr) {
        int maxElement = arr[0][0];
        int rowIndex = 0;
        int colIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > maxElement) {
                    maxElement = arr[i][j];
                    rowIndex = i;
                    colIndex = j;
                }
            }
        }

        // Store the result in an array
        int[] maxInfo = { maxElement, rowIndex, colIndex };
        return maxInfo;
    }

    public static int findMaxElementOnly(int[][] arr) {
        int max = 0;
        for (int[] row : arr) {
            for (int element : row) {
                if(element>max){
                    max =element;
                }
            }
        }
        return max;
    }


}
