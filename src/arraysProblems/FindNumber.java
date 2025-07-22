package arraysProblems;

public class FindNumber {
    public static void main(String[] args) {
        int[] val={23,45,90,87,65};
        int target=100;
        System.out.println("The presence of " + target + " is " + findNums(val,target));
    }
    static Boolean findNums(int[] arr,int target){
        for (int actual : arr) {
            if (actual == target) {
                return true;
            }
        }
        return false;
    }
}
