package arraysProblems;

import java.util.Arrays;

public class FindMinIn2DArray {
    public static void main(String[] args) {
        int[][] arr={
                {-100,12,34,23,67,-1},
                {100,7,9},
                {21,98,67,43,-21,65,81,90,76,-19900}
        };
        System.out.println("The min val is : " + fetchMinVal(arr));
        System.out.println("The min val co ordinates is : " + Arrays.toString(fetchMinValIndex(arr)));
    }
    static int fetchMinVal(int[][] arr){
        int minVal=arr[0][0];
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]<minVal){
                    minVal=arr[row][col];
                }
            }
        }
        return minVal;
    }
    static int[] fetchMinValIndex(int[][] arr) {
        int minVal = arr[0][0];
        int[] minIndex={0,0};
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] < minVal) {
                    minVal = arr[row][col];
                    minIndex[0]=row;
                    minIndex[1]=col;
                }
            }
        }
        return minIndex;
    }
}
