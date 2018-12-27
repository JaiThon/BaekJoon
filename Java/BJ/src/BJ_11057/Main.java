package BJ_11057;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] dp = new int[N+1][10];
		int mod = 10007;
		
		for(int i = 0; i <= 9; i++)
			dp[1][i] = 1;
		for(int i = 1; i <= N; i++){
			for(int j = 0; j <= 9; j++) {
				for(int k = 0; k <= j; k++) {
					dp[i][j] += dp[i-1][k];
					dp[i][j] %= mod;
				}
			}
		}
		long ans = 0;
		for(int i = 0; i < dp[N].length; i++)
			ans += dp[N][i];
		System.out.println(ans%mod);
	}	
}
