package java_fundamentals.basics;

import java.util.Scanner;


public class TakeInputs {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = sc.nextLine();
		System.out.println("Hello " + name);
	}
}
