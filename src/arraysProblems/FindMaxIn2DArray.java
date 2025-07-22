package arraysProblems;

public class FindMaxIn2DArray {
    public static void main(String[] args) {
        int[][] arr={
                {120,34,23,67,11200},
                {1,7,9,100,1000},
                {21,67,340098,43,65,81,90,76}
        };
        System.out.println("The max value in the given array is : " + findMax(arr));
    }
    static int findMax(int[][] arr){
        int maxVal=arr[0][0];
        for(int row=0;row<arr.length;row++){
           for(int col=0;col<arr[row].length;col++){
               int val=arr[row][col];
               if(val>maxVal){
                   maxVal=arr[row][col];
               }
           }
        }
        return maxVal;
    }
}
