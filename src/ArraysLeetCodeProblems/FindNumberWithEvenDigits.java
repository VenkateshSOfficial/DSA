package ArraysLeetCodeProblems;

/*
 * https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
 */
public class FindNumberWithEvenDigits {
	public static void main(String[] args) {
		System.out.println("The count is : " + countTheDigits(345909876));
	}

	static int countTheDigits(int num) {
		int count = 0;
		while (num > 0) {
			count++;
			num = num / 10;
		}
		return count;
	}
}
