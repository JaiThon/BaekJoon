package BJ_2156;

import java.util.Scanner;

public class Main {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] A = new int[n];
		int[][] dp = new int[n+1][3];
		for(int i = 0; i < n; i++) 
			A[i] = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			dp[i][0] = Math.max(dp[i-1][0], Math.max(dp[i-1][1], dp[i-1][2]));
			dp[i][1] = dp[i-1][0] + A[i-1];
			dp[i][2] = dp[i-1][1] + A[i-1];
		}
		System.out.println(Math.max(dp[n][0], Math.max(dp[n][1], dp[n][2])));
	}
}
