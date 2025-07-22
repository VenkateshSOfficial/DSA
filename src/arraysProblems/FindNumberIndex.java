package arraysProblems;

public class FindNumberIndex {
    public static void main(String[] args) {
        int[] val={23,45,90,87,65};
        int target=87;
        System.out.println("The index of " + target + " is " + findIndex(val,target));
    }
    static  int findIndex(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            int actual=arr[i];
            if(actual==target){
                return i;
            }
        }
        return -1;
    }
}
