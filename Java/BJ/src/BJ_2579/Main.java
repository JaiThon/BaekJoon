package BJ_2579;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N+1];
		int[][] dp = new int[N+1][3];

		for(int i = 0; i < N; i++) 
			A[i+1] = sc.nextInt();
		
		dp[1][0] = 0;
		dp[1][1] = A[1];
		dp[1][2] = A[1];
		
		for(int i = 2; i <= N; i++) {
			dp[i][0] = Math.max(dp[i-1][0], Math.max(dp[i-1][1], dp[i-1][2]));
			dp[i][1] = Math.max(dp[i-1][0], dp[i-2][2]) + A[i];
			dp[i][2] = Math.max(dp[i-1][1], dp[i-1][0]) + A[i];
			if(i == N){
				dp[i][0] = 0;
				dp[i][1] = dp[i-1][0] + A[i];
				dp[i][2] = dp[i-1][1] + A[i];
			}
		}
		int ans = Math.max(dp[N][0], Math.max(dp[N][1], dp[N][2]));
		System.out.println(ans);
	}
}
