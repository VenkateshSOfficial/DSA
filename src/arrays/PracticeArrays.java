package arrays;

public class PracticeArrays {
    public static void main(String[] args) {
        int[] rollno={10,21,34,67};
        System.out.println(rollno.length);
        rollno[2]=10;
        System.out.println(rollno[2]);
        for (int val : rollno) {
            System.out.println(val);
        }
    }
}
