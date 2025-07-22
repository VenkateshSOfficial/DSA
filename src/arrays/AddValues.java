package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AddValues {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] val=new int[5];
        for(int i=0;i<val.length;i++){
            System.out.println("please enter the value you want to add in array!");
            val[i]=s.nextInt();
        }
        System.out.println(Arrays.toString(val));
    }
}
