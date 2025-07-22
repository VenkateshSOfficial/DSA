package arraysProblems;

public class FindMaxValue {
    public static void main(String[] args) {
        int[] val={23,45,100,90,87,65};
        System.out.println("The max value is " + fetchMaxValue(val));
    }
    static int fetchMaxValue(int[] arr){
        if(arr.length==0){
            return -1;
        }
        int maxValue=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] > maxValue){
                maxValue=arr[i];
            }
        }
        return maxValue;
    }
}
