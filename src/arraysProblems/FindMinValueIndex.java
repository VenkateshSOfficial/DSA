package arraysProblems;

public class FindMinValueIndex {
    public static void main(String[] args) {
        int[] val={12,23,45,-10,90,-100,87,65};
        System.out.println("The index of min val is : " + findIndex(val));
    }
    static int findIndex(int[] arr){
        if(arr.length==0){
            return -1;
        }
        int minVal=arr[0];
        int minValIndex=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<minVal){
                minVal=arr[i];
                minValIndex=i;

            }
        }
        return minValIndex;
    }
}
