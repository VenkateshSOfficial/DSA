package java_fundamentals.conditions;

import java.util.Scanner;


public class PracticeConditions {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your salary: ");
		double salary=s.nextDouble();
		if(salary>=50000) {
			System.out.println("You are in the highest tax bracket.");
		}
		else if(salary>=20000) {
			System.out.println("You are in the medium tax bracket.");
		}
		else {
			System.out.println("You are in the lowest tax bracket.");

		}
	}
}
