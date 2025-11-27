package learning.JavaPattern;


public class SlidingWindowVariant {

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 5, 5, 1};
        int k = 3;
        int sum = 0;

        for(int i = 0 ; i< k ;i++){
            sum+= arr[i];
        }

        int remv = 0;
        int max =  sum;

        for (int add = k ; add< arr.length ; add ++){
            sum+= arr[add];
            sum-= arr[remv];
            max = Math.max(sum,max);
            remv++;
        }
        System.out.println(max);


    }
}

