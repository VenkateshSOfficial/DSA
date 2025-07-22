package arraysProblems;

public class FindMinValue {
    public static void main(String[] args) {
        int[] val={29,45,67,10,1,-1,-100,19};
        System.out.println("The min value is : " + minValue(val));
    }
    static int minValue(int[] arr){
        if(arr.length==0){
            return -1;
        }
        int minValue=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] < minValue){
                minValue=arr[i];
            }
        }
        return minValue;
    }
}
