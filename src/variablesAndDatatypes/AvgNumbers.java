package variablesAndDatatypes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AvgNumbers {
    public static int calculateAverage(){
        Scanner s=new Scanner(System.in);
        List<Integer> numbers=new ArrayList<>();
        int sum=0;
        int avg=0;
        System.out.println("Enter the numbers, also type -1 once finished !");
        do {
            numbers.add(s.nextInt());
        } while (s.nextInt() != -1);
        for (Integer number : numbers) {
            sum=sum+number;
        }
        avg=sum/numbers.size();
        return avg;
    }

    public static void main(String[] args) {
        System.out.println("The avg is : " + calculateAverage());
    }
}
