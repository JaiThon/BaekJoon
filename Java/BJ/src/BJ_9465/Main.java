package BJ_9465;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
		for(int t = 0; t < test_case; t++) {
			int n = sc.nextInt();
			int[][] cost = new int[2][n];
			int[][] dp = new int[n][3];
			for(int i = 0; i <= 1; i++) {
				for(int j = 0; j < n; j++) {
					cost[i][j] = sc.nextInt(); 
				}
			}
			dp[0][0] = 0;
			dp[0][1] = cost[0][0];
			dp[0][2] = cost[1][0];
			for(int i = 1; i < n; i++) {
				dp[i][0] = Math.max(dp[i-1][0], Math.max(dp[i-1][1], dp[i-1][2]));
				dp[i][1] = Math.max(dp[i-1][0], dp[i-1][2]) + cost[0][i];
				dp[i][2] = Math.max(dp[i-1][1], dp[i-1][0]) + cost[1][i];
			}
			System.out.println(Math.max(dp[n-1][0], Math.max(dp[n-1][1], dp[n-1][2])));
		}
	}
}
