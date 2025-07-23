package ArraysLeetCodeProblems;


/*
 * https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
 */
public class FindNumberWithEvenDigits {
	public static void main(String[] args) {
		int[ ] val= {12,678,5679,1,297,456098};
		int count=findNumbers(val);
        System.out.println(count);
	}
    static int findNumbers(int[] nums) {
        int count=0;
        for(int num:nums){
            if(validateEvenDigits(num)){
                count++;
            }
        }
        return count;
    }
    static boolean validateEvenDigits(int num){
        return countTheDigits(num) % 2 == 0;
    }
    static int countTheDigits(int num){
        int count=0;
        if(num<0){
            return -1;
        }
        if(num==0){
            return 1;
        }
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }
}
