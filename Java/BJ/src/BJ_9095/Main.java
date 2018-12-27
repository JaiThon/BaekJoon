package BJ_9095;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
		for(int a = 0; a < test_case; a++) {
			int N = sc.nextInt();
			int[] dp = new int[N+1];
			// dp[n] = dp[n-3] + dp[n-2] + dp[n-1]
			dp[0] = 1;
			dp[1] = 1;
			if(N >= 2)
				dp[2] = 2;
			
			
			for(int i = 3; i < dp.length; i++)
				dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
			System.out.println(dp[dp.length-1]);
		}
	}
}
