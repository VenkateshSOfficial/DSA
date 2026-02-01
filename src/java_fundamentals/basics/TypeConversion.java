package java_fundamentals.basics;

import java.util.Scanner;


public class TypeConversion {
	public static void main(String[] args) {
		/*Scanner s=new Scanner(System.in);
		System.out.println("Enter a value: ");
		float val=s.nextFloat();
		System.out.println("Value: " + val);*/
		/*System.out.print("Enter an integer: ");
		int intValue=s.nextInt();
		System.out.println("Integer value: " + intValue);*/

		/*int num=(int)78.987f;
		System.out.println("The number is: " + num);*/

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		float a=(int)sc.nextFloat();
		System.out.println("The number you entered is: " + a);
	}
}
