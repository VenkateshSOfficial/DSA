package arraysProblems;

public class FindMaxValueIndex {
    public static void main(String[] args) {
        int[] val={23,120,90,87,65};
        System.out.println("The max value index is " + findTheIndex(val));
    }
    static int findTheIndex(int[] arr){
        if(arr.length==0){
            return -1;
        }
        int maxVal=arr[0];
        int maxValIndex=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>maxVal){
                maxVal=arr[i];
                maxValIndex=i;
            }
        }
        return maxValIndex;
    }
}
