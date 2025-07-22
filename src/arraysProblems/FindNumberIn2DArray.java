package arraysProblems;

import java.util.Arrays;

public class FindNumberIn2DArray {
    public static void main(String[] args) {
        int[][] arr={
                {12,34,23,67},
                {1,7,9},
                {21,98,67,43,65,81,90,76}
        };
        int target=67;
        System.out.println(Arrays.toString(fetchNumber(arr,target)));
    }
    static int[] fetchNumber(int[][] arr,int target){
        if(arr.length==0){
            return new int[]{-1,-1};
        }
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                int val=arr[row][col];
                if(val==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
