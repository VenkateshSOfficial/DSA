package ArraysLeetCodeProblems;

public class RichestCustomerWealth {
	public static void main(String[] args) {
		int[][] accounts = {
			    {1, 5},
			    {7, 3},
			    {3, 5}
			};
		System.out.println("The max welth : " + maxWealth(accounts));
	}
	static int maxWealth(int[][] arr) {
		int ans=Integer.MIN_VALUE;
		for(int person=0;person<arr.length;person++) {
			int sum=0;
			for(int account=0;account<arr[person].length;account++) {
				sum=sum+arr[person][account];
			}
			if(sum>ans) {
				ans=sum;
			}
		}
		return ans;
	}
}
