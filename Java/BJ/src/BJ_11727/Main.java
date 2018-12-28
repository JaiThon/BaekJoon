package BJ_11727;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] dp = new int[size+1];
		dp[0] = 1;
		dp[1] = 1;
		// dp[n] = dp[n-1] + 2*dp[n-2]
		for(int i = 2; i < dp.length; i++)
			dp[i] = (dp[i-1] + 2 * dp[i-2]) % 10007;
		System.out.println(dp[size]);
	}
}
